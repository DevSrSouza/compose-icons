package compose.icons.evaicons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.evaicons.FillGroup

public val FillGroup.BookOpen: ImageVector
    get() {
        if (_bookOpen != null) {
            return _bookOpen!!
        }
        _bookOpen = Builder(name = "BookOpen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(24.0f, 24.0f)
                lineToRelative(-24.0f, -0.0f)
                lineToRelative(-0.0f, -24.0f)
                lineToRelative(24.0f, -0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 4.34f)
                arcToRelative(1.24f, 1.24f, 0.0f, false, false, -1.08f, -0.23f)
                lineTo(13.0f, 5.89f)
                verticalLineTo(20.16f)
                lineToRelative(7.56f, -1.94f)
                arcTo(1.25f, 1.25f, 0.0f, false, false, 21.5f, 17.0f)
                verticalLineTo(5.32f)
                arcTo(1.25f, 1.25f, 0.0f, false, false, 21.0f, 4.34f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 5.89f)
                lineTo(4.06f, 4.11f)
                arcTo(1.27f, 1.27f, 0.0f, false, false, 3.0f, 4.34f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, -0.48f, 1.0f)
                verticalLineTo(17.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.94f, 1.21f)
                lineTo(11.0f, 20.16f)
                close()
            }
        }
        .build()
        return _bookOpen!!
    }

private var _bookOpen: ImageVector? = null
