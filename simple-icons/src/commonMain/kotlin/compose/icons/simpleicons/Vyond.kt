package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Vyond: ImageVector
    get() {
        if (_vyond != null) {
            return _vyond!!
        }
        _vyond = Builder(name = "Vyond", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.55f, 16.382f)
                lineTo(0.0f, 7.616f)
                horizontalLineToRelative(1.328f)
                lineToRelative(0.928f, 6.18f)
                lineToRelative(0.932f, -6.18f)
                horizontalLineToRelative(1.328f)
                lineToRelative(-1.55f, 8.766f)
                lineTo(1.55f, 16.382f)
                close()
                moveTo(7.036f, 8.772f)
                lineTo(6.022f, 8.772f)
                lineToRelative(1.166f, 3.776f)
                verticalLineToRelative(2.68f)
                horizontalLineToRelative(0.924f)
                verticalLineToRelative(-2.68f)
                lineTo(9.28f, 8.772f)
                lineTo(8.262f, 8.772f)
                lineTo(7.65f, 11.35f)
                lineToRelative(-0.614f, -2.58f)
                verticalLineToRelative(0.002f)
                close()
                moveTo(12.156f, 10.692f)
                curveToRelative(0.0f, -0.324f, -0.128f, -0.482f, -0.372f, -0.482f)
                reflectiveCurveToRelative(-0.37f, 0.16f, -0.37f, 0.482f)
                verticalLineToRelative(2.616f)
                curveToRelative(0.0f, 0.324f, 0.126f, 0.492f, 0.37f, 0.492f)
                reflectiveCurveToRelative(0.372f, -0.166f, 0.372f, -0.492f)
                verticalLineToRelative(-2.616f)
                close()
                moveTo(11.812f, 9.436f)
                curveToRelative(0.69f, 0.0f, 1.144f, 0.468f, 1.144f, 1.262f)
                verticalLineToRelative(2.52f)
                curveToRelative(0.0f, 0.872f, -0.432f, 1.346f, -1.172f, 1.346f)
                reflectiveCurveToRelative(-1.162f, -0.468f, -1.162f, -1.376f)
                verticalLineToRelative(-2.52f)
                curveToRelative(0.0f, -0.766f, 0.44f, -1.24f, 1.19f, -1.24f)
                moveToRelative(5.032f, -0.656f)
                verticalLineToRelative(4.2f)
                lineToRelative(-1.344f, -4.2f)
                horizontalLineToRelative(-0.896f)
                verticalLineToRelative(6.456f)
                horizontalLineToRelative(0.924f)
                verticalLineToRelative(-3.944f)
                lineToRelative(1.316f, 3.944f)
                horizontalLineToRelative(0.936f)
                lineTo(17.78f, 8.772f)
                horizontalLineToRelative(-0.936f)
                close()
                moveTo(21.914f, 15.092f)
                curveToRelative(0.508f, 0.0f, 0.706f, -0.322f, 0.706f, -0.92f)
                verticalLineToRelative(-4.22f)
                curveToRelative(0.0f, -0.72f, -0.336f, -1.044f, -1.08f, -1.044f)
                horizontalLineToRelative(-0.31f)
                verticalLineToRelative(6.184f)
                horizontalLineToRelative(0.684f)
                close()
                moveTo(19.89f, 7.616f)
                horizontalLineToRelative(1.924f)
                curveToRelative(1.504f, 0.0f, 2.186f, 0.784f, 2.186f, 2.408f)
                verticalLineToRelative(3.912f)
                curveToRelative(0.0f, 1.678f, -0.62f, 2.448f, -2.122f, 2.448f)
                lineTo(19.89f, 16.384f)
                lineTo(19.89f, 7.616f)
                close()
            }
        }
        .build()
        return _vyond!!
    }

private var _vyond: ImageVector? = null
