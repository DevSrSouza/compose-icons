package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.Gift: ImageVector
    get() {
        if (_gift != null) {
            return _gift!!
        }
        _gift = Builder(name = "Gift", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 68.0f)
                lineTo(188.4f, 68.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -57.6f, -41.7f)
                arcToRelative(30.4f, 30.4f, 0.0f, false, false, -2.8f, 3.3f)
                arcToRelative(30.4f, 30.4f, 0.0f, false, false, -2.8f, -3.3f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 67.6f, 68.0f)
                lineTo(40.0f, 68.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 20.0f, 88.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 16.0f, 19.6f)
                lineTo(36.0f, 200.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(200.0f, 220.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(220.0f, 139.6f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 236.0f, 120.0f)
                lineTo(236.0f, 88.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 216.0f, 68.0f)
                close()
                moveTo(212.0f, 116.0f)
                lineTo(140.0f, 116.0f)
                lineTo(140.0f, 92.0f)
                horizontalLineToRelative(72.0f)
                close()
                moveTo(147.8f, 43.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 8.5f, -3.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 8.5f, 20.5f)
                curveToRelative(-3.3f, 3.3f, -13.5f, 5.8f, -24.1f, 7.0f)
                curveTo(142.1f, 55.4f, 145.0f, 46.0f, 147.8f, 43.2f)
                close()
                moveTo(91.2f, 43.2f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, 17.0f, 0.0f)
                curveToRelative(3.3f, 3.3f, 5.8f, 13.5f, 7.0f, 24.1f)
                curveToRelative(-11.8f, -1.4f, -21.2f, -4.3f, -24.0f, -7.1f)
                arcTo(12.2f, 12.2f, 0.0f, false, true, 91.2f, 43.2f)
                close()
                moveTo(44.0f, 92.0f)
                horizontalLineToRelative(72.0f)
                verticalLineToRelative(24.0f)
                lineTo(44.0f, 116.0f)
                close()
                moveTo(60.0f, 140.0f)
                horizontalLineToRelative(56.0f)
                verticalLineToRelative(56.0f)
                lineTo(60.0f, 196.0f)
                close()
                moveTo(140.0f, 196.0f)
                lineTo(140.0f, 140.0f)
                horizontalLineToRelative(56.0f)
                verticalLineToRelative(56.0f)
                close()
            }
        }
        .build()
        return _gift!!
    }

private var _gift: ImageVector? = null
