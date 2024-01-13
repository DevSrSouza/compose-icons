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

public val SolidGroup.Stamp: ImageVector
    get() {
        if (_stamp != null) {
            return _stamp!!
        }
        _stamp = Builder(name = "Stamp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(312.0f, 201.8f)
                curveToRelative(0.0f, -17.4f, 9.2f, -33.2f, 19.9f, -47.0f)
                curveTo(344.5f, 138.5f, 352.0f, 118.1f, 352.0f, 96.0f)
                curveToRelative(0.0f, -53.0f, -43.0f, -96.0f, -96.0f, -96.0f)
                reflectiveCurveToRelative(-96.0f, 43.0f, -96.0f, 96.0f)
                curveToRelative(0.0f, 22.1f, 7.5f, 42.5f, 20.1f, 58.8f)
                curveToRelative(10.7f, 13.8f, 19.9f, 29.6f, 19.9f, 47.0f)
                curveToRelative(0.0f, 29.9f, -24.3f, 54.2f, -54.2f, 54.2f)
                horizontalLineTo(112.0f)
                curveTo(50.1f, 256.0f, 0.0f, 306.1f, 0.0f, 368.0f)
                curveToRelative(0.0f, 20.9f, 13.4f, 38.7f, 32.0f, 45.3f)
                verticalLineTo(464.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                horizontalLineTo(432.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                verticalLineTo(413.3f)
                curveToRelative(18.6f, -6.6f, 32.0f, -24.4f, 32.0f, -45.3f)
                curveToRelative(0.0f, -61.9f, -50.1f, -112.0f, -112.0f, -112.0f)
                horizontalLineTo(366.2f)
                curveToRelative(-29.9f, 0.0f, -54.2f, -24.3f, -54.2f, -54.2f)
                close()
                moveTo(416.0f, 416.0f)
                verticalLineToRelative(32.0f)
                horizontalLineTo(96.0f)
                verticalLineTo(416.0f)
                horizontalLineTo(416.0f)
                close()
            }
        }
        .build()
        return _stamp!!
    }

private var _stamp: ImageVector? = null
