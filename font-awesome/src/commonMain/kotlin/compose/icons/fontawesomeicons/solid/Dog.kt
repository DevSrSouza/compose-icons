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

public val SolidGroup.Dog: ImageVector
    get() {
        if (_dog != null) {
            return _dog!!
        }
        _dog = Builder(name = "Dog", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(309.6f, 158.5f)
                lineTo(332.7f, 19.8f)
                curveTo(334.6f, 8.4f, 344.5f, 0.0f, 356.1f, 0.0f)
                curveToRelative(7.5f, 0.0f, 14.5f, 3.5f, 19.0f, 9.5f)
                lineTo(392.0f, 32.0f)
                horizontalLineToRelative(52.1f)
                curveToRelative(12.7f, 0.0f, 24.9f, 5.1f, 33.9f, 14.1f)
                lineTo(496.0f, 64.0f)
                horizontalLineToRelative(56.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                verticalLineToRelative(24.0f)
                curveToRelative(0.0f, 44.2f, -35.8f, 80.0f, -80.0f, 80.0f)
                horizontalLineTo(464.0f)
                horizontalLineTo(448.0f)
                horizontalLineTo(426.7f)
                lineToRelative(-5.1f, 30.5f)
                lineToRelative(-112.0f, -64.0f)
                close()
                moveTo(416.0f, 256.1f)
                lineTo(416.0f, 480.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                horizontalLineTo(352.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                verticalLineTo(364.8f)
                curveToRelative(-24.0f, 12.3f, -51.2f, 19.2f, -80.0f, 19.2f)
                reflectiveCurveToRelative(-56.0f, -6.9f, -80.0f, -19.2f)
                verticalLineTo(480.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                horizontalLineTo(96.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                verticalLineTo(249.8f)
                curveToRelative(-28.8f, -10.9f, -51.4f, -35.3f, -59.2f, -66.5f)
                lineTo(1.0f, 167.8f)
                curveToRelative(-4.3f, -17.1f, 6.1f, -34.5f, 23.3f, -38.8f)
                reflectiveCurveToRelative(34.5f, 6.1f, 38.8f, 23.3f)
                lineToRelative(3.9f, 15.5f)
                curveTo(70.5f, 182.0f, 83.3f, 192.0f, 98.0f, 192.0f)
                horizontalLineToRelative(30.0f)
                horizontalLineToRelative(16.0f)
                horizontalLineTo(303.8f)
                lineTo(416.0f, 256.1f)
                close()
                moveTo(464.0f, 80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -32.0f, 0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 32.0f, 0.0f)
                close()
            }
        }
        .build()
        return _dog!!
    }

private var _dog: ImageVector? = null
