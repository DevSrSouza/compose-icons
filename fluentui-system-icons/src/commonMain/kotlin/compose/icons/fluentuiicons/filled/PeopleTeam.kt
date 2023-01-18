package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.PeopleTeam: ImageVector
    get() {
        if (_peopleTeam != null) {
            return _peopleTeam!!
        }
        _peopleTeam = Builder(name = "PeopleTeam", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.754f, 10.0f)
                curveTo(15.7205f, 10.0f, 16.504f, 10.7835f, 16.504f, 11.75f)
                verticalLineTo(16.499f)
                curveTo(16.504f, 18.9848f, 14.4888f, 21.0f, 12.003f, 21.0f)
                curveTo(9.5171f, 21.0f, 7.5019f, 18.9848f, 7.5019f, 16.499f)
                verticalLineTo(11.75f)
                curveTo(7.5019f, 10.7835f, 8.2854f, 10.0f, 9.2519f, 10.0f)
                horizontalLineTo(14.754f)
                close()
                moveTo(7.1313f, 9.9991f)
                curveTo(6.7818f, 10.4218f, 6.5564f, 10.9508f, 6.5106f, 11.5304f)
                lineTo(6.5019f, 11.75f)
                verticalLineTo(16.499f)
                curveTo(6.5019f, 17.3456f, 6.6932f, 18.1476f, 7.0349f, 18.864f)
                curveTo(6.7058f, 18.953f, 6.359f, 19.0f, 6.0012f, 19.0f)
                curveTo(3.7914f, 19.0f, 2.0f, 17.2086f, 2.0f, 14.9988f)
                verticalLineTo(11.75f)
                curveTo(2.0f, 10.8318f, 2.7071f, 10.0788f, 3.6065f, 10.0058f)
                lineTo(3.75f, 10.0f)
                lineTo(7.1313f, 9.9991f)
                close()
                moveTo(16.8747f, 9.9991f)
                lineTo(20.25f, 10.0f)
                curveTo(21.2165f, 10.0f, 22.0f, 10.7835f, 22.0f, 11.75f)
                verticalLineTo(15.0f)
                curveTo(22.0f, 17.2091f, 20.2091f, 19.0f, 18.0f, 19.0f)
                curveTo(17.6436f, 19.0f, 17.298f, 18.9534f, 16.9691f, 18.8659f)
                curveTo(17.2697f, 18.238f, 17.4538f, 17.5452f, 17.4951f, 16.8144f)
                lineTo(17.504f, 16.499f)
                verticalLineTo(11.75f)
                curveTo(17.504f, 11.0847f, 17.2678f, 10.4747f, 16.8747f, 9.9991f)
                close()
                moveTo(12.0f, 3.0f)
                curveTo(13.6569f, 3.0f, 15.0f, 4.3432f, 15.0f, 6.0f)
                curveTo(15.0f, 7.6568f, 13.6569f, 9.0f, 12.0f, 9.0f)
                curveTo(10.3431f, 9.0f, 9.0f, 7.6568f, 9.0f, 6.0f)
                curveTo(9.0f, 4.3432f, 10.3431f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(18.5f, 4.0f)
                curveTo(19.8807f, 4.0f, 21.0f, 5.1193f, 21.0f, 6.5f)
                curveTo(21.0f, 7.8807f, 19.8807f, 9.0f, 18.5f, 9.0f)
                curveTo(17.1193f, 9.0f, 16.0f, 7.8807f, 16.0f, 6.5f)
                curveTo(16.0f, 5.1193f, 17.1193f, 4.0f, 18.5f, 4.0f)
                close()
                moveTo(5.5f, 4.0f)
                curveTo(6.8807f, 4.0f, 8.0f, 5.1193f, 8.0f, 6.5f)
                curveTo(8.0f, 7.8807f, 6.8807f, 9.0f, 5.5f, 9.0f)
                curveTo(4.1193f, 9.0f, 3.0f, 7.8807f, 3.0f, 6.5f)
                curveTo(3.0f, 5.1193f, 4.1193f, 4.0f, 5.5f, 4.0f)
                close()
            }
        }
        .build()
        return _peopleTeam!!
    }

private var _peopleTeam: ImageVector? = null
