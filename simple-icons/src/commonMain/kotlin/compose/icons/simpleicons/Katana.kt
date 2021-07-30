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

public val SimpleIcons.Katana: ImageVector
    get() {
        if (_katana != null) {
            return _katana!!
        }
        _katana = Builder(name = "Katana", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.373f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.373f, 12.0f, -12.0f)
                reflectiveCurveTo(18.627f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.016f, 22.762f)
                lineTo(12.0f, 22.762f)
                curveToRelative(-5.95f, -0.009f, -10.765f, -4.84f, -10.756f, -10.789f)
                curveToRelative(0.009f, -5.95f, 4.839f, -10.766f, 10.789f, -10.757f)
                curveToRelative(5.943f, 0.009f, 10.756f, 4.829f, 10.756f, 10.773f)
                curveToRelative(0.0f, 5.95f, -4.823f, 10.773f, -10.773f, 10.773f)
                close()
                moveTo(21.491f, 11.905f)
                arcToRelative(5.562f, 5.562f, 0.0f, false, true, -9.142f, 3.214f)
                arcToRelative(6.331f, 6.331f, 0.0f, false, false, 3.251f, -2.062f)
                lineToRelative(0.104f, 0.169f)
                curveToRelative(0.339f, 0.584f, 0.568f, 1.226f, 0.676f, 1.893f)
                arcToRelative(6.281f, 6.281f, 0.0f, false, false, -0.349f, -2.656f)
                arcToRelative(6.328f, 6.328f, 0.0f, false, false, -8.94f, -8.63f)
                arcToRelative(5.563f, 5.563f, 0.0f, false, true, 7.418f, 6.256f)
                arcToRelative(6.334f, 6.334f, 0.0f, false, false, -3.425f, -1.762f)
                lineToRelative(0.093f, -0.175f)
                arcToRelative(5.53f, 5.53f, 0.0f, false, true, 1.304f, -1.533f)
                arcToRelative(6.31f, 6.31f, 0.0f, false, false, -2.122f, 1.636f)
                arcToRelative(6.327f, 6.327f, 0.0f, false, false, -3.016f, 12.044f)
                arcToRelative(5.564f, 5.564f, 0.0f, false, true, 1.713f, -9.562f)
                arcToRelative(6.33f, 6.33f, 0.0f, false, false, 0.185f, 3.818f)
                horizontalLineToRelative(-0.186f)
                arcToRelative(5.535f, 5.535f, 0.0f, false, true, -1.98f, -0.36f)
                arcToRelative(6.295f, 6.295f, 0.0f, false, false, 2.471f, 1.025f)
                arcToRelative(6.328f, 6.328f, 0.0f, false, false, 8.513f, 2.758f)
                arcToRelative(6.319f, 6.319f, 0.0f, false, false, 3.432f, -6.073f)
                close()
                moveTo(10.473f, 10.462f)
                arcToRelative(5.582f, 5.582f, 0.0f, false, true, 3.6f, 0.998f)
                arcToRelative(5.584f, 5.584f, 0.0f, false, true, -2.667f, 2.618f)
                arcToRelative(5.57f, 5.57f, 0.0f, false, true, -0.933f, -3.616f)
                close()
            }
        }
        .build()
        return _katana!!
    }

private var _katana: ImageVector? = null
