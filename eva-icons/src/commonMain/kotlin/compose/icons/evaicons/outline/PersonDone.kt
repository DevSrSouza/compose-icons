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

public val OutlineGroup.PersonDone: ImageVector
    get() {
        if (_personDone != null) {
            return _personDone!!
        }
        _personDone = Builder(name = "PersonDone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(-24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.66f, 4.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.41f, 0.09f)
                lineTo(18.38f, 6.49f)
                lineToRelative(-0.63f, -0.71f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.5f, 1.33f)
                lineToRelative(1.39f, 1.56f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.75f, 0.33f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.74f, -0.34f)
                lineToRelative(2.61f, -3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.66f, 4.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 11.0f)
                arcTo(4.0f, 4.0f, 0.0f, true, false, 6.0f, 7.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 10.0f, 11.0f)
                close()
                moveTo(10.0f, 5.0f)
                arcTo(2.0f, 2.0f, 0.0f, true, true, 8.0f, 7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 13.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -7.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 10.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 10.0f, 13.0f)
                close()
            }
        }
        .build()
        return _personDone!!
    }

private var _personDone: ImageVector? = null
