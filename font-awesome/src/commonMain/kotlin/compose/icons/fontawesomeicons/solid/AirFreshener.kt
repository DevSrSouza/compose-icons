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

public val SolidGroup.AirFreshener: ImageVector
    get() {
        if (_airFreshener != null) {
            return _airFreshener!!
        }
        _airFreshener = Builder(name = "AirFreshener", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(378.94f, 321.41f)
                lineTo(284.7f, 224.0f)
                horizontalLineToRelative(49.22f)
                curveToRelative(15.3f, 0.0f, 23.66f, -16.6f, 13.86f, -27.53f)
                lineTo(234.45f, 69.96f)
                curveToRelative(3.43f, -6.61f, 5.55f, -14.0f, 5.55f, -21.96f)
                curveToRelative(0.0f, -26.51f, -21.49f, -48.0f, -48.0f, -48.0f)
                reflectiveCurveToRelative(-48.0f, 21.49f, -48.0f, 48.0f)
                curveToRelative(0.0f, 7.96f, 2.12f, 15.35f, 5.55f, 21.96f)
                lineTo(36.22f, 196.47f)
                curveTo(26.42f, 207.4f, 34.78f, 224.0f, 50.08f, 224.0f)
                horizontalLineTo(99.3f)
                lineTo(5.06f, 321.41f)
                curveTo(-6.69f, 333.56f, 3.34f, 352.0f, 21.7f, 352.0f)
                horizontalLineTo(160.0f)
                verticalLineToRelative(32.0f)
                horizontalLineTo(48.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, 7.16f, -16.0f, 16.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(288.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                verticalLineToRelative(-96.0f)
                curveToRelative(0.0f, -8.84f, -7.16f, -16.0f, -16.0f, -16.0f)
                horizontalLineTo(224.0f)
                verticalLineToRelative(-32.0f)
                horizontalLineToRelative(138.3f)
                curveToRelative(18.36f, 0.0f, 28.39f, -18.44f, 16.64f, -30.59f)
                close()
                moveTo(192.0f, 31.98f)
                curveToRelative(8.85f, 0.0f, 16.02f, 7.17f, 16.02f, 16.02f)
                curveToRelative(0.0f, 8.84f, -7.17f, 16.02f, -16.02f, 16.02f)
                reflectiveCurveTo(175.98f, 56.84f, 175.98f, 48.0f)
                curveToRelative(0.0f, -8.85f, 7.17f, -16.02f, 16.02f, -16.02f)
                close()
                moveTo(304.0f, 432.0f)
                verticalLineToRelative(32.0f)
                horizontalLineTo(80.0f)
                verticalLineToRelative(-32.0f)
                horizontalLineToRelative(224.0f)
                close()
            }
        }
        .build()
        return _airFreshener!!
    }

private var _airFreshener: ImageVector? = null
