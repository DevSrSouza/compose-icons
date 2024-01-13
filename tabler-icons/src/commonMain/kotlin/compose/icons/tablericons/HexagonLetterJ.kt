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

public val TablerIcons.HexagonLetterJ: ImageVector
    get() {
        if (_hexagonLetterJ != null) {
            return _hexagonLetterJ!!
        }
        _hexagonLetterJ = Builder(name = "HexagonLetterJ", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.875f, 6.27f)
                arcToRelative(2.225f, 2.225f, 0.0f, false, true, 1.125f, 1.948f)
                verticalLineToRelative(7.284f)
                curveToRelative(0.0f, 0.809f, -0.443f, 1.555f, -1.158f, 1.948f)
                lineToRelative(-6.75f, 4.27f)
                arcToRelative(2.269f, 2.269f, 0.0f, false, true, -2.184f, 0.0f)
                lineToRelative(-6.75f, -4.27f)
                arcToRelative(2.225f, 2.225f, 0.0f, false, true, -1.158f, -1.948f)
                verticalLineToRelative(-7.285f)
                curveToRelative(0.0f, -0.809f, 0.443f, -1.554f, 1.158f, -1.947f)
                lineToRelative(6.75f, -3.98f)
                arcToRelative(2.33f, 2.33f, 0.0f, false, true, 2.25f, 0.0f)
                lineToRelative(6.75f, 3.98f)
                horizontalLineToRelative(-0.033f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 8.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
        }
        .build()
        return _hexagonLetterJ!!
    }

private var _hexagonLetterJ: ImageVector? = null
