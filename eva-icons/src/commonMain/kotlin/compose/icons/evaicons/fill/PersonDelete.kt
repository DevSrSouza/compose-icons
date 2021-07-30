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

public val FillGroup.PersonDelete: ImageVector
    get() {
        if (_personDelete != null) {
            return _personDelete!!
        }
        _personDelete = Builder(name = "PersonDelete", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(20.47f, 7.5f)
                lineToRelative(0.73f, -0.73f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.73f, 5.3f)
                lineTo(19.0f, 6.0f)
                lineToRelative(-0.73f, -0.73f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.8f, 6.77f)
                lineToRelative(0.73f, 0.73f)
                lineToRelative(-0.73f, 0.73f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.27f, 9.7f)
                lineTo(19.0f, 9.0f)
                lineToRelative(0.73f, 0.73f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.2f, 8.23f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 11.0f)
                arcTo(4.0f, 4.0f, 0.0f, true, false, 6.0f, 7.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 10.0f, 11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 3.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _personDelete!!
    }

private var _personDelete: ImageVector? = null
