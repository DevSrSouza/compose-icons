package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.CloudOff: VectorAsset
    get() {
        if (_cloudOff != null) {
            return _cloudOff!!
        }
        _cloudOff = VectorAssetBuilder(name = "CloudOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineTo(21.0f, 21.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 18.0f)
                horizontalLineToRelative(-11.0f)
                curveToRelative(-2.598f, 0.0f, -4.705f, -2.015f, -4.705f, -4.5f)
                reflectiveCurveToRelative(2.107f, -4.5f, 4.705f, -4.5f)
                curveToRelative(0.112f, -0.5f, 0.305f, -0.973f, 0.568f, -1.408f)
                moveToRelative(2.094f, -1.948f)
                curveToRelative(0.329f, -0.174f, 0.68f, -0.319f, 1.05f, -0.43f)
                curveToRelative(1.9f, -0.576f, 3.997f, -0.194f, 5.5f, 1.0f)
                curveToRelative(1.503f, 1.192f, 2.185f, 3.017f, 1.788f, 4.786f)
                horizontalLineToRelative(1.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 2.212f, 6.212f)
            }
        }
        .build()
        return _cloudOff!!
    }

private var _cloudOff: VectorAsset? = null
