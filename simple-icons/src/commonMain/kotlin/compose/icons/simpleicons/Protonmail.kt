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

public val SimpleIcons.Protonmail: VectorAsset
    get() {
        if (_protonmail != null) {
            return _protonmail!!
        }
        _protonmail = VectorAssetBuilder(name = "Protonmail", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 20.351f)
                reflectiveCurveToRelative(-1.096f, -0.108f, -1.955f, -0.705f)
                curveToRelative(-0.86f, -0.596f, -6.58f, -4.688f, -6.58f, -4.688f)
                verticalLineToRelative(8.098f)
                reflectiveCurveTo(3.513f, 24.0f, 4.55f, 24.0f)
                horizontalLineToRelative(14.9f)
                curveToRelative(1.036f, 0.0f, 1.085f, -0.942f, 1.085f, -0.942f)
                verticalLineToRelative(-8.1f)
                reflectiveCurveToRelative(-5.723f, 4.092f, -6.58f, 4.69f)
                curveToRelative(-0.86f, 0.595f, -1.955f, 0.704f, -1.955f, 0.704f)
                close()
                moveTo(12.0f, 0.001f)
                reflectiveCurveTo(4.925f, -0.23f, 3.465f, 7.623f)
                verticalLineToRelative(5.35f)
                reflectiveCurveToRelative(0.06f, 0.572f, 1.67f, 1.735f)
                curveToRelative(1.607f, 1.162f, 5.773f, 4.436f, 6.867f, 4.436f)
                curveToRelative(1.088f, 0.0f, 5.254f, -3.273f, 6.865f, -4.437f)
                curveToRelative(1.607f, -1.164f, 1.668f, -1.737f, 1.668f, -1.737f)
                lineTo(20.535f, 7.62f)
                curveTo(19.075f, -0.229f, 12.0f, 0.003f, 12.0f, 0.003f)
                close()
                moveTo(16.846f, 10.537f)
                horizontalLineToRelative(-9.69f)
                lineTo(7.156f, 7.623f)
                curveTo(8.14f, 3.723f, 12.0f, 3.67f, 12.0f, 3.67f)
                reflectiveCurveToRelative(3.863f, 0.054f, 4.846f, 3.954f)
                close()
            }
        }
        .build()
        return _protonmail!!
    }

private var _protonmail: VectorAsset? = null
