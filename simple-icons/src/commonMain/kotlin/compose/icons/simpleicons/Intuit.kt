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

public val SimpleIcons.Intuit: ImageVector
    get() {
        if (_intuit != null) {
            return _intuit!!
        }
        _intuit = Builder(name = "Intuit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.32f, 12.38f)
                curveToRelative(0.0f, 1.174f, 0.974f, 2.033f, 2.211f, 2.033f)
                curveToRelative(1.237f, 0.0f, 2.212f, -0.859f, 2.212f, -2.033f)
                verticalLineToRelative(-2.7f)
                horizontalLineToRelative(-1.198f)
                verticalLineToRelative(2.56f)
                curveToRelative(0.0f, 0.633f, -0.44f, 1.06f, -1.017f, 1.06f)
                reflectiveCurveToRelative(-1.017f, -0.424f, -1.017f, -1.06f)
                lineTo(13.511f, 9.68f)
                horizontalLineToRelative(-1.198f)
                lineToRelative(0.008f, 2.699f)
                close()
                moveTo(19.944f, 10.761f)
                horizontalLineToRelative(1.429f)
                verticalLineToRelative(3.563f)
                horizontalLineToRelative(1.198f)
                lineTo(22.571f, 10.76f)
                lineTo(24.0f, 10.76f)
                lineTo(24.0f, 9.68f)
                horizontalLineToRelative(-4.056f)
                verticalLineToRelative(1.082f)
                close()
                moveTo(19.17f, 9.68f)
                horizontalLineToRelative(-1.198f)
                verticalLineToRelative(4.645f)
                horizontalLineToRelative(1.198f)
                lineTo(19.17f, 9.679f)
                close()
                moveTo(7.482f, 10.761f)
                horizontalLineToRelative(1.43f)
                verticalLineToRelative(3.563f)
                horizontalLineToRelative(1.197f)
                lineTo(10.109f, 10.76f)
                horizontalLineToRelative(1.428f)
                lineTo(11.537f, 9.68f)
                lineTo(7.482f, 9.68f)
                verticalLineToRelative(1.082f)
                close()
                moveTo(1.198f, 9.68f)
                lineTo(0.0f, 9.68f)
                verticalLineToRelative(4.645f)
                horizontalLineToRelative(1.198f)
                lineTo(1.198f, 9.679f)
                close()
                moveTo(6.851f, 11.62f)
                curveToRelative(0.0f, -1.174f, -0.974f, -2.032f, -2.212f, -2.032f)
                curveToRelative(-1.238f, 0.0f, -2.212f, 0.858f, -2.212f, 2.032f)
                verticalLineToRelative(2.705f)
                horizontalLineToRelative(1.198f)
                verticalLineToRelative(-2.56f)
                curveToRelative(0.0f, -0.633f, 0.44f, -1.06f, 1.017f, -1.06f)
                reflectiveCurveToRelative(1.018f, 0.425f, 1.018f, 1.06f)
                verticalLineToRelative(2.56f)
                horizontalLineToRelative(1.197f)
                lineTo(6.85f, 11.62f)
                horizontalLineToRelative(0.001f)
                close()
            }
        }
        .build()
        return _intuit!!
    }

private var _intuit: ImageVector? = null
