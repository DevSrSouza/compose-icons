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

public val SimpleIcons.Myspace: VectorAsset
    get() {
        if (_myspace != null) {
            return _myspace!!
        }
        _myspace = VectorAssetBuilder(name = "Myspace", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.803f, 12.274f)
                curveToRelative(2.108f, 0.0f, 3.818f, -1.703f, 3.818f, -3.804f)
                reflectiveCurveToRelative(-1.71f, -3.795f, -3.818f, -3.795f)
                curveToRelative(-2.109f, 0.0f, -3.818f, 1.71f, -3.818f, 3.81f)
                curveToRelative(0.0f, 2.101f, 1.709f, 3.811f, 3.818f, 3.811f)
                verticalLineToRelative(-0.022f)
                close()
                moveTo(11.2f, 12.979f)
                curveToRelative(1.897f, 0.0f, 3.436f, -1.533f, 3.436f, -3.424f)
                reflectiveCurveTo(13.098f, 6.13f, 11.2f, 6.13f)
                reflectiveCurveTo(7.764f, 7.676f, 7.764f, 9.566f)
                curveTo(7.764f, 11.457f, 9.299f, 13.0f, 11.2f, 13.0f)
                verticalLineToRelative(-0.021f)
                close()
                moveTo(3.4f, 13.614f)
                curveToRelative(1.71f, 0.0f, 3.093f, -1.38f, 3.093f, -3.081f)
                curveToRelative(0.0f, -1.704f, -1.395f, -3.084f, -3.105f, -3.084f)
                curveTo(1.681f, 7.449f, 0.3f, 8.829f, 0.3f, 10.539f)
                curveToRelative(0.0f, 1.7f, 1.387f, 3.078f, 3.095f, 3.078f)
                lineToRelative(0.005f, -0.003f)
                close()
                moveTo(3.4f, 14.319f)
                curveToRelative(-1.96f, 0.0f, -3.4f, 1.717f, -3.4f, 3.495f)
                verticalLineToRelative(1.196f)
                curveToRelative(0.0f, 0.17f, 0.138f, 0.31f, 0.31f, 0.31f)
                horizontalLineToRelative(6.18f)
                curveToRelative(0.171f, 0.0f, 0.309f, -0.14f, 0.309f, -0.31f)
                verticalLineToRelative(-1.196f)
                curveToRelative(0.0f, -1.779f, -1.437f, -3.5f, -3.398f, -3.5f)
                lineToRelative(-0.001f, 0.005f)
                close()
                moveTo(11.2f, 13.759f)
                curveToRelative(-2.179f, 0.0f, -3.78f, 1.915f, -3.78f, 3.891f)
                verticalLineToRelative(1.331f)
                curveToRelative(0.0f, 0.188f, 0.156f, 0.344f, 0.345f, 0.344f)
                horizontalLineToRelative(6.871f)
                curveToRelative(0.188f, 0.0f, 0.342f, -0.155f, 0.342f, -0.344f)
                lineTo(14.978f, 17.65f)
                curveToRelative(0.0f, -1.976f, -1.598f, -3.891f, -3.778f, -3.891f)
                close()
                moveTo(19.803f, 13.142f)
                curveToRelative(-2.422f, 0.0f, -4.197f, 2.126f, -4.197f, 4.323f)
                verticalLineToRelative(1.477f)
                curveToRelative(0.0f, 0.21f, 0.172f, 0.381f, 0.382f, 0.381f)
                horizontalLineToRelative(7.63f)
                curveToRelative(0.21f, 0.0f, 0.383f, -0.171f, 0.383f, -0.381f)
                verticalLineToRelative(-1.477f)
                curveToRelative(-0.001f, -2.197f, -1.776f, -4.323f, -4.198f, -4.323f)
                close()
            }
        }
        .build()
        return _myspace!!
    }

private var _myspace: VectorAsset? = null
