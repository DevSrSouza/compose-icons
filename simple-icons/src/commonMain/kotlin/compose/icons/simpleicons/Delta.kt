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

public val SimpleIcons.Delta: ImageVector
    get() {
        if (_delta != null) {
            return _delta!!
        }
        _delta = Builder(name = "Delta", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 13.455f)
                horizontalLineToRelative(-0.689f)
                lineToRelative(-0.288f, -0.739f)
                horizontalLineToRelative(-1.2f)
                lineToRelative(-0.289f, 0.739f)
                horizontalLineToRelative(-0.644f)
                lineToRelative(1.233f, -2.96f)
                horizontalLineToRelative(0.666f)
                close()
                moveTo(22.84f, 12.222f)
                lineToRelative(-0.411f, -1.044f)
                lineToRelative(-0.411f, 1.044f)
                close()
                moveTo(18.525f, 13.455f)
                horizontalLineToRelative(0.66f)
                verticalLineToRelative(-2.438f)
                horizontalLineToRelative(0.995f)
                verticalLineToRelative(-0.51f)
                horizontalLineToRelative(-2.644f)
                verticalLineToRelative(0.51f)
                horizontalLineToRelative(0.989f)
                close()
                moveTo(14.699f, 13.455f)
                horizontalLineToRelative(1.927f)
                verticalLineToRelative(-0.511f)
                lineTo(15.36f, 12.944f)
                verticalLineToRelative(-2.438f)
                horizontalLineToRelative(-0.661f)
                close()
                moveTo(11.417f, 11.017f)
                horizontalLineToRelative(1.416f)
                verticalLineToRelative(-0.51f)
                horizontalLineToRelative(-2.077f)
                verticalLineToRelative(2.948f)
                horizontalLineToRelative(2.121f)
                verticalLineToRelative(-0.511f)
                horizontalLineToRelative(-1.46f)
                verticalLineToRelative(-0.766f)
                horizontalLineToRelative(1.25f)
                verticalLineToRelative(-0.511f)
                horizontalLineToRelative(-1.25f)
                close()
                moveTo(6.436f, 13.455f)
                horizontalLineToRelative(1.038f)
                curveToRelative(1.072f, 0.0f, 1.71f, -0.555f, 1.71f, -1.472f)
                curveToRelative(0.0f, -0.916f, -0.638f, -1.471f, -1.71f, -1.471f)
                lineTo(6.436f, 10.512f)
                close()
                moveTo(7.091f, 11.017f)
                horizontalLineToRelative(0.383f)
                curveToRelative(0.694f, 0.0f, 1.044f, 0.344f, 1.044f, 0.96f)
                curveToRelative(0.0f, 0.617f, -0.344f, 0.961f, -1.044f, 0.961f)
                horizontalLineToRelative(-0.383f)
                close()
                moveTo(4.814f, 13.172f)
                arcToRelative(0.15f, 0.15f, 0.0f, false, true, 0.15f, 0.15f)
                arcToRelative(0.15f, 0.15f, 0.0f, false, true, -0.15f, 0.15f)
                arcToRelative(0.15f, 0.15f, 0.0f, false, true, -0.15f, -0.15f)
                arcToRelative(0.15f, 0.15f, 0.0f, false, true, 0.15f, -0.15f)
                moveToRelative(0.0f, 0.277f)
                arcToRelative(0.13f, 0.13f, 0.0f, false, false, 0.134f, -0.127f)
                curveToRelative(0.0f, -0.073f, -0.056f, -0.128f, -0.134f, -0.128f)
                arcToRelative(0.126f, 0.126f, 0.0f, false, false, -0.127f, 0.128f)
                curveToRelative(0.0f, 0.072f, 0.055f, 0.127f, 0.127f, 0.127f)
                moveToRelative(-0.033f, -0.039f)
                lineTo(4.76f, 13.41f)
                verticalLineToRelative(-0.177f)
                horizontalLineToRelative(0.067f)
                curveToRelative(0.038f, 0.0f, 0.055f, 0.016f, 0.055f, 0.05f)
                curveToRelative(0.0f, 0.033f, -0.022f, 0.044f, -0.044f, 0.05f)
                lineToRelative(0.055f, 0.077f)
                horizontalLineToRelative(-0.028f)
                lineToRelative(-0.05f, -0.077f)
                horizontalLineToRelative(-0.033f)
                close()
                moveTo(4.781f, 13.31f)
                horizontalLineToRelative(0.028f)
                curveToRelative(0.022f, 0.0f, 0.05f, 0.0f, 0.05f, -0.027f)
                curveToRelative(0.0f, -0.022f, -0.022f, -0.028f, -0.039f, -0.028f)
                horizontalLineToRelative(-0.039f)
                close()
                moveTo(0.0f, 13.85f)
                horizontalLineToRelative(4.626f)
                lineToRelative(-2.31f, -0.978f)
                close()
                moveTo(0.172f, 13.455f)
                lineToRelative(2.144f, -1.033f)
                lineToRelative(2.143f, 1.033f)
                lineToRelative(-2.143f, -3.304f)
                close()
            }
        }
        .build()
        return _delta!!
    }

private var _delta: ImageVector? = null
