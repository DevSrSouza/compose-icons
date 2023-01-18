package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.Gift: ImageVector
    get() {
        if (_gift != null) {
            return _gift!!
        }
        _gift = Builder(name = "Gift", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 72.0f)
                lineTo(181.0f, 72.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -47.3f, -42.9f)
                arcToRelative(29.2f, 29.2f, 0.0f, false, false, -5.7f, 8.2f)
                arcToRelative(29.2f, 29.2f, 0.0f, false, false, -5.7f, -8.2f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 75.0f, 72.0f)
                lineTo(40.0f, 72.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 88.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(200.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(216.0f, 136.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(232.0f, 88.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 72.0f)
                close()
                moveTo(145.0f, 40.4f)
                arcTo(16.0f, 16.0f, 0.0f, true, true, 167.6f, 63.0f)
                curveToRelative(-4.9f, 5.0f, -19.2f, 7.7f, -31.3f, 8.7f)
                curveTo(137.3f, 59.6f, 140.0f, 45.3f, 145.0f, 40.4f)
                close()
                moveTo(88.4f, 40.4f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, true, 22.6f, 0.0f)
                curveToRelative(5.0f, 4.9f, 7.7f, 19.2f, 8.7f, 31.3f)
                curveToRelative(-12.1f, -1.0f, -26.4f, -3.7f, -31.3f, -8.7f)
                arcTo(16.1f, 16.1f, 0.0f, false, true, 88.4f, 40.4f)
                close()
                moveTo(216.0f, 120.0f)
                lineTo(136.0f, 120.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(120.0f, 120.0f)
                lineTo(40.0f, 120.0f)
                lineTo(40.0f, 88.0f)
                horizontalLineToRelative(80.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(16.0f)
                lineTo(136.0f, 88.0f)
                horizontalLineToRelative(80.0f)
                verticalLineToRelative(32.0f)
                close()
            }
        }
        .build()
        return _gift!!
    }

private var _gift: ImageVector? = null
