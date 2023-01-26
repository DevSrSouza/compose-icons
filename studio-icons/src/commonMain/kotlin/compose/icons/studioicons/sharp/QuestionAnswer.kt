package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.QuestionAnswer: ImageVector
    get() {
        if (_questionAnswer != null) {
            return _questionAnswer!!
        }
        _questionAnswer = Builder(name = "QuestionAnswer", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 6.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(9.0f)
                lineTo(6.0f, 15.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(12.0f)
                lineToRelative(4.0f, 4.0f)
                lineTo(22.0f, 6.0f)
                close()
                moveTo(17.0f, 13.0f)
                lineTo(17.0f, 2.0f)
                lineTo(2.0f, 2.0f)
                verticalLineToRelative(15.0f)
                lineToRelative(4.0f, -4.0f)
                horizontalLineToRelative(11.0f)
                close()
            }
        }
        .build()
        return _questionAnswer!!
    }

private var _questionAnswer: ImageVector? = null