package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.WashTemperature5: ImageVector
    get() {
        if (_washTemperature5 != null) {
            return _washTemperature5!!
        }
        _washTemperature5 = Builder(name = "WashTemperature5", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 15.0f)
                horizontalLineToRelative(0.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 6.0f)
                lineToRelative(1.721f, 10.329f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.973f, 1.671f)
                horizontalLineToRelative(10.612f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.973f, -1.671f)
                lineToRelative(1.721f, -10.329f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 15.0f)
                horizontalLineToRelative(0.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 12.0f)
                horizontalLineToRelative(0.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                horizontalLineToRelative(0.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 12.0f)
                horizontalLineToRelative(0.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.486f, 8.965f)
                curveToRelative(0.168f, 0.02f, 0.34f, 0.033f, 0.514f, 0.035f)
                curveToRelative(0.79f, 0.009f, 1.539f, -0.178f, 2.0f, -0.5f)
                curveToRelative(0.461f, -0.32f, 1.21f, -0.507f, 2.0f, -0.5f)
                curveToRelative(0.79f, -0.007f, 1.539f, 0.18f, 2.0f, 0.5f)
                curveToRelative(0.461f, 0.322f, 1.21f, 0.509f, 2.0f, 0.5f)
                curveToRelative(0.79f, 0.009f, 1.539f, -0.178f, 2.0f, -0.5f)
                curveToRelative(0.461f, -0.32f, 1.21f, -0.507f, 2.0f, -0.5f)
                curveToRelative(0.79f, -0.007f, 1.539f, 0.18f, 2.0f, 0.5f)
                curveToRelative(0.461f, 0.322f, 1.21f, 0.509f, 2.0f, 0.5f)
                curveToRelative(0.17f, 0.0f, 0.339f, -0.014f, 0.503f, -0.034f)
            }
        }
        .build()
        return _washTemperature5!!
    }

private var _washTemperature5: ImageVector? = null
