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

public val SimpleIcons.Steinberg: VectorAsset
    get() {
        if (_steinberg != null) {
            return _steinberg!!
        }
        _steinberg = VectorAssetBuilder(name = "Steinberg", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.481f, 12.629f)
                curveToRelative(0.642f, -0.371f, 0.642f, -1.009f, 0.0f, -1.379f)
                lineToRelative(-4.769f, -2.754f)
                curveToRelative(-0.642f, -0.371f, -1.195f, -0.052f, -1.195f, 0.69f)
                verticalLineToRelative(5.507f)
                curveToRelative(0.0f, 0.741f, 0.553f, 1.06f, 1.195f, 0.69f)
                lineTo(19.481f, 12.629f)
                close()
                moveTo(12.001f, 2.727f)
                curveToRelative(5.121f, 0.0f, 9.273f, 4.152f, 9.273f, 9.273f)
                reflectiveCurveToRelative(-4.152f, 9.273f, -9.273f, 9.273f)
                reflectiveCurveTo(2.729f, 17.121f, 2.729f, 12.0f)
                reflectiveCurveTo(6.88f, 2.727f, 12.001f, 2.727f)
                moveTo(12.001f, 0.002f)
                curveTo(5.386f, 0.002f, 0.004f, 5.384f, 0.004f, 12.0f)
                curveToRelative(0.0f, 6.616f, 5.382f, 11.998f, 11.998f, 11.998f)
                reflectiveCurveTo(23.999f, 18.616f, 23.999f, 12.0f)
                curveTo(23.999f, 5.384f, 18.617f, 0.002f, 12.001f, 0.002f)
                lineTo(12.001f, 0.002f)
                close()
            }
        }
        .build()
        return _steinberg!!
    }

private var _steinberg: VectorAsset? = null
