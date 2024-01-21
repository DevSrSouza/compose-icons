package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Infinity: ImageVector
    get() {
        if (_infinity != null) {
            return _infinity!!
        }
        _infinity = Builder(name = "Infinity", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 241.1f)
                curveTo(0.0f, 161.0f, 65.0f, 96.0f, 145.1f, 96.0f)
                curveToRelative(38.5f, 0.0f, 75.4f, 15.3f, 102.6f, 42.5f)
                lineTo(320.0f, 210.7f)
                lineToRelative(72.2f, -72.2f)
                curveTo(419.5f, 111.3f, 456.4f, 96.0f, 494.9f, 96.0f)
                curveTo(575.0f, 96.0f, 640.0f, 161.0f, 640.0f, 241.1f)
                verticalLineToRelative(29.7f)
                curveTo(640.0f, 351.0f, 575.0f, 416.0f, 494.9f, 416.0f)
                curveToRelative(-38.5f, 0.0f, -75.4f, -15.3f, -102.6f, -42.5f)
                lineTo(320.0f, 301.3f)
                lineToRelative(-72.2f, 72.2f)
                curveTo(220.5f, 400.7f, 183.6f, 416.0f, 145.1f, 416.0f)
                curveTo(65.0f, 416.0f, 0.0f, 351.0f, 0.0f, 270.9f)
                lineTo(0.0f, 241.1f)
                close()
                moveTo(274.7f, 256.0f)
                lineToRelative(-72.2f, -72.2f)
                curveToRelative(-15.2f, -15.2f, -35.9f, -23.8f, -57.4f, -23.8f)
                curveTo(100.3f, 160.0f, 64.0f, 196.3f, 64.0f, 241.1f)
                verticalLineToRelative(29.7f)
                curveToRelative(0.0f, 44.8f, 36.3f, 81.1f, 81.1f, 81.1f)
                curveToRelative(21.5f, 0.0f, 42.2f, -8.5f, 57.4f, -23.8f)
                lineTo(274.7f, 256.0f)
                close()
                moveTo(365.2f, 256.0f)
                lineToRelative(72.2f, 72.2f)
                curveToRelative(15.2f, 15.2f, 35.9f, 23.8f, 57.4f, 23.8f)
                curveToRelative(44.8f, 0.0f, 81.1f, -36.3f, 81.1f, -81.1f)
                lineTo(575.9f, 241.1f)
                curveToRelative(0.0f, -44.8f, -36.3f, -81.1f, -81.1f, -81.1f)
                curveToRelative(-21.5f, 0.0f, -42.2f, 8.5f, -57.4f, 23.8f)
                lineTo(365.3f, 256.0f)
                close()
            }
        }
        .build()
        return _infinity!!
    }

private var _infinity: ImageVector? = null
