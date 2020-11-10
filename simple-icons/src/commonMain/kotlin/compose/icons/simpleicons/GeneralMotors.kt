package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.GeneralMotors: VectorAsset
    get() {
        if (_generalMotors != null) {
            return _generalMotors!!
        }
        _generalMotors = VectorAssetBuilder(name = "GeneralMotors", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.002f)
                verticalLineToRelative(23.996f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 0.002f)
                close()
                moveTo(8.254f, 5.838f)
                curveToRelative(2.293f, 0.0f, 2.293f, 1.788f, 2.293f, 2.412f)
                verticalLineToRelative(0.636f)
                lineTo(9.176f, 8.886f)
                lineTo(9.176f, 8.25f)
                curveToRelative(0.0f, -0.345f, 0.0f, -1.177f, -0.9f, -1.177f)
                curveToRelative(-0.89f, 0.0f, -0.89f, 0.818f, -0.89f, 1.177f)
                verticalLineToRelative(4.415f)
                curveToRelative(0.0f, 0.692f, 0.214f, 1.216f, 0.89f, 1.216f)
                curveToRelative(0.674f, 0.0f, 0.9f, -0.492f, 0.9f, -1.216f)
                verticalLineToRelative(-1.427f)
                lineTo(8.39f, 11.238f)
                verticalLineToRelative(-1.084f)
                horizontalLineToRelative(2.157f)
                verticalLineToRelative(4.884f)
                lineToRelative(-1.326f, -0.013f)
                verticalLineToRelative(-0.479f)
                curveToRelative(-0.113f, 0.183f, -0.647f, 0.662f, -1.414f, 0.661f)
                curveToRelative(-1.296f, -0.009f, -1.796f, -0.905f, -1.796f, -2.272f)
                lineTo(6.011f, 8.25f)
                curveToRelative(0.0f, -0.37f, 0.0f, -2.412f, 2.243f, -2.412f)
                close()
                moveTo(11.957f, 6.024f)
                horizontalLineToRelative(2.028f)
                lineToRelative(0.993f, 6.597f)
                lineToRelative(1.015f, -6.597f)
                horizontalLineToRelative(2.006f)
                verticalLineToRelative(9.014f)
                horizontalLineToRelative(-1.337f)
                lineTo(16.662f, 8.25f)
                lineToRelative(-1.127f, 6.788f)
                lineTo(14.38f, 15.038f)
                lineTo(13.292f, 8.25f)
                verticalLineToRelative(6.775f)
                horizontalLineToRelative(-1.335f)
                close()
                moveTo(6.003f, 16.072f)
                lineTo(18.01f, 16.072f)
                verticalLineToRelative(1.949f)
                lineTo(6.003f, 18.021f)
                close()
            }
        }
        .build()
        return _generalMotors!!
    }

private var _generalMotors: VectorAsset? = null
