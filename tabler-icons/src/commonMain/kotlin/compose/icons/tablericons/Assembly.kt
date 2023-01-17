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

public val TablerIcons.Assembly: ImageVector
    get() {
        if (_assembly != null) {
            return _assembly!!
        }
        _assembly = Builder(name = "Assembly", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 6.873f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.0f, 1.747f)
                verticalLineToRelative(6.536f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.029f, 1.748f)
                lineToRelative(-6.0f, 3.833f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.942f, 0.0f)
                lineToRelative(-6.0f, -3.833f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.029f, -1.747f)
                verticalLineToRelative(-6.537f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.029f, -1.748f)
                lineToRelative(6.0f, -3.572f)
                arcToRelative(2.056f, 2.056f, 0.0f, false, true, 2.0f, 0.0f)
                lineToRelative(6.0f, 3.573f)
                horizontalLineToRelative(-0.029f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.5f, 9.422f)
                curveToRelative(0.312f, 0.18f, 0.503f, 0.515f, 0.5f, 0.876f)
                verticalLineToRelative(3.277f)
                curveToRelative(0.0f, 0.364f, -0.197f, 0.7f, -0.515f, 0.877f)
                lineToRelative(-3.0f, 1.922f)
                arcToRelative(0.997f, 0.997f, 0.0f, false, true, -0.97f, 0.0f)
                lineToRelative(-3.0f, -1.922f)
                arcToRelative(1.003f, 1.003f, 0.0f, false, true, -0.515f, -0.876f)
                verticalLineToRelative(-3.278f)
                curveToRelative(0.0f, -0.364f, 0.197f, -0.7f, 0.514f, -0.877f)
                lineToRelative(3.0f, -1.79f)
                curveToRelative(0.311f, -0.174f, 0.69f, -0.174f, 1.0f, 0.0f)
                lineToRelative(3.0f, 1.79f)
                horizontalLineToRelative(-0.014f)
                close()
            }
        }
        .build()
        return _assembly!!
    }

private var _assembly: ImageVector? = null
