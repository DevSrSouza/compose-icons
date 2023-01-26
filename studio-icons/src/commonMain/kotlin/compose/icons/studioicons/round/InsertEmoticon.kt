package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.InsertEmoticon: ImageVector
    get() {
        if (_insertEmoticon != null) {
            return _insertEmoticon!!
        }
        _insertEmoticon = Builder(name = "InsertEmoticon", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.99f, 2.0f)
                curveTo(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.47f, 10.0f, 9.99f, 10.0f)
                curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f)
                reflectiveCurveTo(17.52f, 2.0f, 11.99f, 2.0f)
                close()
                moveTo(8.5f, 8.0f)
                curveTo(9.33f, 8.0f, 10.0f, 8.67f, 10.0f, 9.5f)
                reflectiveCurveTo(9.33f, 11.0f, 8.5f, 11.0f)
                reflectiveCurveTo(7.0f, 10.33f, 7.0f, 9.5f)
                reflectiveCurveTo(7.67f, 8.0f, 8.5f, 8.0f)
                close()
                moveTo(16.75f, 14.75f)
                curveTo(15.8f, 16.39f, 14.03f, 17.5f, 12.0f, 17.5f)
                reflectiveCurveToRelative(-3.8f, -1.11f, -4.75f, -2.75f)
                curveTo(7.06f, 14.42f, 7.31f, 14.0f, 7.69f, 14.0f)
                horizontalLineToRelative(8.62f)
                curveTo(16.7f, 14.0f, 16.94f, 14.42f, 16.75f, 14.75f)
                close()
                moveTo(15.5f, 11.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveTo(14.67f, 8.0f, 15.5f, 8.0f)
                reflectiveCurveTo(17.0f, 8.67f, 17.0f, 9.5f)
                reflectiveCurveTo(16.33f, 11.0f, 15.5f, 11.0f)
                close()
            }
        }
        .build()
        return _insertEmoticon!!
    }

private var _insertEmoticon: ImageVector? = null
