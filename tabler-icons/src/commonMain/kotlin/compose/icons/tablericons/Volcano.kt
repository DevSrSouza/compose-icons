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

public val TablerIcons.Volcano: ImageVector
    get() {
        if (_volcano != null) {
            return _volcano!!
        }
        _volcano = Builder(name = "Volcano", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 8.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 8.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 20.0f)
                lineToRelative(3.472f, -7.812f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.828f, -1.188f)
                horizontalLineToRelative(5.4f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.828f, 1.188f)
                lineToRelative(3.472f, 7.812f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.192f, 15.064f)
                arcToRelative(2.14f, 2.14f, 0.0f, false, true, 0.475f, -0.064f)
                curveToRelative(0.527f, -0.009f, 1.026f, 0.178f, 1.333f, 0.5f)
                curveToRelative(0.307f, 0.32f, 0.806f, 0.507f, 1.333f, 0.5f)
                curveToRelative(0.527f, 0.007f, 1.026f, -0.18f, 1.334f, -0.5f)
                curveToRelative(0.307f, -0.322f, 0.806f, -0.509f, 1.333f, -0.5f)
                curveToRelative(0.527f, -0.009f, 1.026f, 0.178f, 1.333f, 0.5f)
                curveToRelative(0.308f, 0.32f, 0.807f, 0.507f, 1.334f, 0.5f)
                curveToRelative(0.527f, 0.007f, 1.026f, -0.18f, 1.333f, -0.5f)
                curveToRelative(0.307f, -0.322f, 0.806f, -0.509f, 1.333f, -0.5f)
                curveToRelative(0.161f, 0.003f, 0.32f, 0.025f, 0.472f, 0.064f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 8.0f)
                verticalLineToRelative(-4.0f)
            }
        }
        .build()
        return _volcano!!
    }

private var _volcano: ImageVector? = null
