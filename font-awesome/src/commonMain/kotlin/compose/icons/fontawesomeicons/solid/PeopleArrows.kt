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

public val SolidGroup.PeopleArrows: ImageVector
    get() {
        if (_peopleArrows != null) {
            return _peopleArrows!!
        }
        _peopleArrows = Builder(name = "PeopleArrows", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 64.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 128.0f, 0.0f)
                arcTo(64.0f, 64.0f, 0.0f, true, true, 64.0f, 64.0f)
                close()
                moveTo(25.9f, 233.4f)
                curveTo(29.3f, 191.9f, 64.0f, 160.0f, 105.6f, 160.0f)
                horizontalLineToRelative(44.8f)
                curveToRelative(27.0f, 0.0f, 51.0f, 13.4f, 65.5f, 34.1f)
                curveToRelative(-2.7f, 1.9f, -5.2f, 4.0f, -7.5f, 6.3f)
                lineToRelative(-64.0f, 64.0f)
                curveToRelative(-21.9f, 21.9f, -21.9f, 57.3f, 0.0f, 79.2f)
                lineTo(192.0f, 391.2f)
                verticalLineTo(464.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                horizontalLineTo(112.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                verticalLineTo(348.3f)
                curveToRelative(-26.5f, -9.5f, -44.7f, -35.8f, -42.2f, -65.6f)
                lineToRelative(4.1f, -49.3f)
                close()
                moveTo(448.0f, 64.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 128.0f, 0.0f)
                arcTo(64.0f, 64.0f, 0.0f, true, true, 448.0f, 64.0f)
                close()
                moveTo(431.6f, 200.4f)
                curveToRelative(-2.3f, -2.3f, -4.9f, -4.4f, -7.5f, -6.3f)
                curveToRelative(14.5f, -20.7f, 38.6f, -34.1f, 65.5f, -34.1f)
                horizontalLineToRelative(44.8f)
                curveToRelative(41.6f, 0.0f, 76.3f, 31.9f, 79.7f, 73.4f)
                lineToRelative(4.1f, 49.3f)
                curveToRelative(2.5f, 29.8f, -15.7f, 56.1f, -42.2f, 65.6f)
                verticalLineTo(464.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                horizontalLineTo(496.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                verticalLineTo(391.2f)
                lineToRelative(47.6f, -47.6f)
                curveToRelative(21.9f, -21.9f, 21.9f, -57.3f, 0.0f, -79.2f)
                lineToRelative(-64.0f, -64.0f)
                close()
                moveTo(272.0f, 240.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(96.0f)
                verticalLineTo(240.0f)
                curveToRelative(0.0f, -9.7f, 5.8f, -18.5f, 14.8f, -22.2f)
                reflectiveCurveToRelative(19.3f, -1.7f, 26.2f, 5.2f)
                lineToRelative(64.0f, 64.0f)
                curveToRelative(9.4f, 9.4f, 9.4f, 24.6f, 0.0f, 33.9f)
                lineToRelative(-64.0f, 64.0f)
                curveToRelative(-6.9f, 6.9f, -17.2f, 8.9f, -26.2f, 5.2f)
                reflectiveCurveToRelative(-14.8f, -12.5f, -14.8f, -22.2f)
                verticalLineTo(336.0f)
                horizontalLineTo(272.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 9.7f, -5.8f, 18.5f, -14.8f, 22.2f)
                reflectiveCurveToRelative(-19.3f, 1.7f, -26.2f, -5.2f)
                lineToRelative(-64.0f, -64.0f)
                curveToRelative(-9.4f, -9.4f, -9.4f, -24.6f, 0.0f, -33.9f)
                lineToRelative(64.0f, -64.0f)
                curveToRelative(6.9f, -6.9f, 17.2f, -8.9f, 26.2f, -5.2f)
                reflectiveCurveToRelative(14.8f, 12.5f, 14.8f, 22.2f)
                close()
            }
        }
        .build()
        return _peopleArrows!!
    }

private var _peopleArrows: ImageVector? = null
