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
                verticalLineTo(363.778f)
                arcToRelative(95.998f, 95.998f, 0.0f, false, false, -14.833f, -51.263f)
                lineTo(398.127f, 54.368f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 357.544f, 32.0f)
                horizontalLineTo(24.0f)
                curveTo(10.745f, 32.0f, 0.0f, 42.745f, 0.0f, 56.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 30.928f, 25.072f, 56.0f, 56.0f, 56.0f)
                horizontalLineToRelative(229.981f)
                curveToRelative(12.844f, 0.0f, 21.556f, 13.067f, 16.615f, 24.923f)
                lineToRelative(-21.41f, 51.385f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 251.648f, 224.0f)
                horizontalLineTo(128.0f)
                curveToRelative(-35.346f, 0.0f, -64.0f, 28.654f, -64.0f, 64.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 13.255f, 10.745f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(147.406f)
                arcToRelative(47.995f, 47.995f, 0.0f, false, true, 25.692f, 7.455f)
                lineToRelative(111.748f, 70.811f)
                arcTo(24.001f, 24.001f, 0.0f, false, true, 384.0f, 418.539f)
                verticalLineTo(480.0f)
                close()
            }
        }
        .build()
        return _handLizard!!
    }

private var _handLizard: ImageVector? = null
