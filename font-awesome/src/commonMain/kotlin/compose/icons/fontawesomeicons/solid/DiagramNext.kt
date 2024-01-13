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

public val SolidGroup.DiagramNext: ImageVector
    get() {
        if (_diagramNext != null) {
            return _diagramNext!!
        }
        _diagramNext = Builder(name = "DiagramNext", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(512.0f, 160.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                horizontalLineTo(280.0f)
                verticalLineToRelative(64.0f)
                horizontalLineToRelative(46.1f)
                curveToRelative(21.4f, 0.0f, 32.1f, 25.9f, 17.0f, 41.0f)
                lineTo(273.0f, 399.0f)
                curveToRelative(-9.4f, 9.4f, -24.6f, 9.4f, -33.9f, 0.0f)
                lineTo(169.0f, 329.0f)
                curveToRelative(-15.1f, -15.1f, -4.4f, -41.0f, 17.0f, -41.0f)
                horizontalLineTo(232.0f)
                verticalLineTo(224.0f)
                horizontalLineTo(64.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                verticalLineTo(96.0f)
                curveTo(0.0f, 60.7f, 28.7f, 32.0f, 64.0f, 32.0f)
                horizontalLineTo(448.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                verticalLineToRelative(64.0f)
                close()
                moveTo(448.0f, 416.0f)
                verticalLineTo(352.0f)
                horizontalLineTo(365.3f)
                lineToRelative(0.4f, -0.4f)
                curveToRelative(18.4f, -18.4f, 20.4f, -43.7f, 11.0f, -63.6f)
                lineToRelative(71.3f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                verticalLineToRelative(64.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                lineTo(64.0f, 480.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                verticalLineTo(352.0f)
                curveToRelative(0.0f, -35.3f, 28.7f, -64.0f, 64.0f, -64.0f)
                lineToRelative(71.3f, 0.0f)
                curveToRelative(-9.4f, 19.9f, -7.4f, 45.2f, 11.0f, 63.6f)
                lineToRelative(0.4f, 0.4f)
                horizontalLineTo(64.0f)
                verticalLineToRelative(64.0f)
                horizontalLineTo(210.7f)
                lineToRelative(5.7f, 5.7f)
                curveToRelative(21.9f, 21.9f, 57.3f, 21.9f, 79.2f, 0.0f)
                lineToRelative(5.7f, -5.7f)
                horizontalLineTo(448.0f)
                close()
            }
        }
        .build()
        return _diagramNext!!
    }

private var _diagramNext: ImageVector? = null
