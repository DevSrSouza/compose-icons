package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.QuestionAnswerLine: ImageVector
    get() {
        if (_questionAnswerLine != null) {
            return _questionAnswerLine!!
        }
        _questionAnswerLine = Builder(name = "QuestionAnswerLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.455f, 15.0f)
                lineTo(1.0f, 18.5f)
                lineTo(1.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(12.0f)
                lineTo(5.455f, 15.0f)
                close()
                moveTo(4.763f, 13.0f)
                lineTo(16.0f, 13.0f)
                lineTo(16.0f, 4.0f)
                lineTo(3.0f, 4.0f)
                verticalLineToRelative(10.385f)
                lineTo(4.763f, 13.0f)
                close()
                moveTo(8.0f, 17.0f)
                horizontalLineToRelative(10.237f)
                lineTo(20.0f, 18.385f)
                lineTo(20.0f, 8.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(13.5f)
                lineTo(17.545f, 19.0f)
                lineTo(9.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _questionAnswerLine!!
    }

private var _questionAnswerLine: ImageVector? = null
