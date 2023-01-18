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

public val FillGroup.Truck: ImageVector
    get() {
        if (_truck != null) {
            return _truck!!
        }
        _truck = Builder(name = "Truck", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.1f, 119.9f)
                verticalLineToRelative(-0.2f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, false, -0.1f, -0.7f)
                verticalLineToRelative(-0.3f)
                curveToRelative(0.0f, -0.2f, -0.1f, -0.4f, -0.1f, -0.6f)
                verticalLineToRelative(-0.2f)
                curveToRelative(-0.1f, -0.3f, -0.1f, -0.5f, -0.2f, -0.8f)
                horizontalLineToRelative(-0.1f)
                lineTo(233.6f, 82.1f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 218.7f, 72.0f)
                lineTo(184.1f, 72.0f)
                lineTo(184.1f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(24.1f, 56.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                lineTo(8.1f, 184.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(13.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 62.0f, 0.0f)
                horizontalLineToRelative(58.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 62.0f, 0.0f)
                horizontalLineToRelative(13.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(248.1f, 120.0f)
                close()
                moveTo(184.1f, 88.0f)
                horizontalLineToRelative(34.6f)
                lineToRelative(9.6f, 24.0f)
                lineTo(184.1f, 112.0f)
                close()
                moveTo(24.1f, 72.0f)
                horizontalLineToRelative(144.0f)
                verticalLineToRelative(64.0f)
                lineTo(24.1f, 136.0f)
                close()
                moveTo(68.1f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 68.1f, 208.0f)
                close()
                moveTo(188.1f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 188.1f, 208.0f)
                close()
            }
        }
        .build()
        return _truck!!
    }

private var _truck: ImageVector? = null
