package compose.icons.evaicons.outline

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
import compose.icons.evaicons.OutlineGroup

public val OutlineGroup.BookOpen: ImageVector
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
                moveTo(20.62f, 4.22f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.84f, -0.2f)
                lineTo(12.0f, 5.77f)
                lineTo(4.22f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.0f, 5.0f)
                verticalLineTo(17.2f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.78f, 1.0f)
                lineToRelative(8.0f, 1.8f)
                lineTo(12.0f, 20.0f)
                lineToRelative(0.22f, 0.0f)
                lineToRelative(8.0f, -1.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.78f, -1.0f)
                verticalLineTo(5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.62f, 4.22f)
                close()
                moveTo(5.0f, 6.25f)
                lineTo(11.0f, 7.6f)
                verticalLineTo(17.75f)
                lineTo(5.0f, 16.4f)
                close()
                moveTo(19.0f, 16.4f)
                lineToRelative(-6.0f, 1.35f)
                verticalLineTo(7.6f)
                lineToRelative(6.0f, -1.35f)
                close()
            }
        }
        .build()
        return _bookOpen!!
    }

private var _bookOpen: ImageVector? = null
