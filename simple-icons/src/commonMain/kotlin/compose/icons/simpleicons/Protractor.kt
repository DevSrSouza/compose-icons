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

public val SimpleIcons.Protractor: ImageVector
    get() {
        if (_protractor != null) {
            return _protractor!!
        }
        _protractor = Builder(name = "Protractor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.37f, 0.0f, 0.0f, 5.372f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.371f, 12.0f, 12.0f, 12.0f)
                curveToRelative(6.628f, 0.0f, 12.0f, -5.372f, 12.0f, -12.0f)
                reflectiveCurveTo(18.627f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(11.727f, 3.789f)
                verticalLineToRelative(1.71f)
                horizontalLineToRelative(0.545f)
                verticalLineToRelative(-1.71f)
                arcToRelative(9.055f, 9.055f, 0.0f, false, true, 5.961f, 2.468f)
                lineToRelative(-1.277f, 1.278f)
                lineToRelative(0.386f, 0.386f)
                lineToRelative(1.277f, -1.278f)
                arcToRelative(9.057f, 9.057f, 0.0f, false, true, 2.469f, 5.96f)
                horizontalLineToRelative(-1.71f)
                verticalLineToRelative(0.546f)
                horizontalLineToRelative(1.717f)
                verticalLineToRelative(2.001f)
                lineTo(2.905f, 15.15f)
                verticalLineToRelative(-2.0f)
                lineTo(4.62f, 13.15f)
                verticalLineToRelative(-0.546f)
                horizontalLineToRelative(-1.71f)
                arcToRelative(9.058f, 9.058f, 0.0f, false, true, 2.469f, -5.96f)
                lineTo(6.658f, 7.92f)
                lineToRelative(0.386f, -0.386f)
                lineToRelative(-1.278f, -1.278f)
                arcToRelative(9.056f, 9.056f, 0.0f, false, true, 5.96f, -2.468f)
                close()
                moveTo(12.0f, 6.965f)
                arcToRelative(5.912f, 5.912f, 0.0f, false, false, -5.913f, 5.912f)
                horizontalLineToRelative(11.824f)
                arcTo(5.91f, 5.91f, 0.0f, false, false, 12.0f, 6.965f)
                close()
            }
        }
        .build()
        return _protractor!!
    }

private var _protractor: ImageVector? = null
