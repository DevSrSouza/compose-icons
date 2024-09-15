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

public val SolidGroup.HandLizard: ImageVector
    get() {
        if (_handLizard != null) {
            return _handLizard!!
        }
        _handLizard = Builder(name = "HandLizard", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(384.0f, 480.0f)
                horizontalLineToRelative(192.0f)
                verticalLineTo(363.78f)
                arcToRelative(96.0f, 96.0f, 0.0f, false, false, -14.83f, -51.26f)
                lineTo(398.13f, 54.37f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 357.54f, 32.0f)
                horizontalLineTo(24.0f)
                curveTo(10.74f, 32.0f, 0.0f, 42.74f, 0.0f, 56.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 30.93f, 25.07f, 56.0f, 56.0f, 56.0f)
                horizontalLineToRelative(229.98f)
                curveToRelative(12.84f, 0.0f, 21.56f, 13.07f, 16.61f, 24.92f)
                lineToRelative(-21.41f, 51.38f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 251.65f, 224.0f)
                horizontalLineTo(128.0f)
                curveToRelative(-35.35f, 0.0f, -64.0f, 28.65f, -64.0f, 64.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 13.26f, 10.74f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(147.41f)
                arcToRelative(47.99f, 47.99f, 0.0f, false, true, 25.69f, 7.45f)
                lineToRelative(111.75f, 70.81f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 384.0f, 418.54f)
                verticalLineTo(480.0f)
                close()
            }
        }
        .build()
        return _handLizard!!
    }

private var _handLizard: ImageVector? = null
