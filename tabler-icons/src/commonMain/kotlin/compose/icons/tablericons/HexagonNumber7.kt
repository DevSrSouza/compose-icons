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

public val TablerIcons.HexagonNumber7: ImageVector
    get() {
        if (_hexagonNumber7 != null) {
            return _hexagonNumber7!!
        }
        _hexagonNumber7 = Builder(name = "HexagonNumber7", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.02f, 6.858f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.0f, 1.752f)
                verticalLineToRelative(6.555f)
                curveToRelative(0.0f, 0.728f, -0.395f, 1.4f, -1.032f, 1.753f)
                lineToRelative(-6.017f, 3.844f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.948f, 0.0f)
                lineToRelative(-6.016f, -3.844f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.032f, -1.752f)
                verticalLineToRelative(-6.556f)
                curveToRelative(0.0f, -0.728f, 0.395f, -1.4f, 1.032f, -1.753f)
                lineToRelative(6.017f, -3.582f)
                arcToRelative(2.062f, 2.062f, 0.0f, false, true, 2.0f, 0.0f)
                lineToRelative(6.017f, 3.583f)
                horizontalLineToRelative(-0.029f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 8.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(-2.0f, 8.0f)
            }
        }
        .build()
        return _hexagonNumber7!!
    }

private var _hexagonNumber7: ImageVector? = null
