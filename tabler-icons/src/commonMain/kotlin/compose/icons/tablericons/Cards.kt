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

public val TablerIcons.Cards: ImageVector
    get() {
        if (_cards != null) {
            return _cards!!
        }
        _cards = Builder(name = "Cards", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.604f, 7.197f)
                lineToRelative(7.138f, -3.109f)
                arcToRelative(0.96f, 0.96f, 0.0f, false, true, 1.27f, 0.527f)
                lineToRelative(4.924f, 11.902f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.514f, 1.304f)
                lineToRelative(-7.137f, 3.109f)
                arcToRelative(0.96f, 0.96f, 0.0f, false, true, -1.271f, -0.527f)
                lineToRelative(-4.924f, -11.903f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.514f, -1.304f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 4.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(3.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 6.0f)
                curveToRelative(0.264f, 0.112f, 0.52f, 0.217f, 0.768f, 0.315f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.53f, 1.311f)
                lineToRelative(-2.298f, 5.374f)
            }
        }
        .build()
        return _cards!!
    }

private var _cards: ImageVector? = null
