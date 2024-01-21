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

public val TablerIcons.AssemblyOff: ImageVector
    get() {
        if (_assemblyOff != null) {
            return _assemblyOff!!
        }
        _assemblyOff = Builder(name = "AssemblyOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.703f, 4.685f)
                lineToRelative(2.326f, -1.385f)
                arcToRelative(2.056f, 2.056f, 0.0f, false, true, 2.0f, 0.0f)
                lineToRelative(6.0f, 3.573f)
                horizontalLineToRelative(-0.029f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.0f, 1.747f)
                verticalLineToRelative(6.536f)
                curveToRelative(0.0f, 0.248f, -0.046f, 0.49f, -0.132f, 0.715f)
                moveToRelative(-2.156f, 1.837f)
                lineToRelative(-4.741f, 3.029f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.942f, 0.0f)
                lineToRelative(-6.0f, -3.833f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.029f, -1.747f)
                verticalLineToRelative(-6.537f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.029f, -1.748f)
                lineToRelative(1.157f, -0.689f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.593f, 7.591f)
                curveToRelative(0.295f, -0.133f, 0.637f, -0.12f, 0.921f, 0.04f)
                lineToRelative(3.0f, 1.79f)
                horizontalLineToRelative(-0.014f)
                curveToRelative(0.312f, 0.181f, 0.503f, 0.516f, 0.5f, 0.877f)
                verticalLineToRelative(1.702f)
                moveToRelative(-1.152f, 2.86f)
                lineToRelative(-2.363f, 1.514f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.97f, 0.0f)
                lineToRelative(-3.0f, -1.922f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.515f, -0.876f)
                verticalLineToRelative(-3.278f)
                curveToRelative(0.0f, -0.364f, 0.197f, -0.7f, 0.514f, -0.877f)
                lineToRelative(0.568f, -0.339f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _assemblyOff!!
    }

private var _assemblyOff: ImageVector? = null
