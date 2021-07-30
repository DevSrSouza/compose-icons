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

public val OutlineGroup.Linkedin: ImageVector
    get() {
        if (_linkedin != null) {
            return _linkedin!!
        }
        _linkedin = Builder(name = "Linkedin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(20.0f, 22.0f)
                horizontalLineTo(18.33f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineTo(14.63f)
                arcToRelative(0.92f, 0.92f, 0.0f, false, false, -0.69f, -0.93f)
                arcToRelative(0.84f, 0.84f, 0.0f, false, false, -0.67f, 0.19f)
                arcToRelative(0.85f, 0.85f, 0.0f, false, false, -0.3f, 0.65f)
                verticalLineTo(20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineTo(11.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineTo(14.54f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, true, 13.0f, 0.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 22.0f)
                close()
                moveTo(15.5f, 11.69f)
                arcToRelative(3.73f, 3.73f, 0.0f, false, true, 0.47f, 0.0f)
                arcToRelative(2.91f, 2.91f, 0.0f, false, true, 2.36f, 2.9f)
                verticalLineTo(20.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(14.54f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, false, -9.0f, 0.0f)
                verticalLineTo(20.0f)
                horizontalLineToRelative(1.67f)
                verticalLineTo(14.54f)
                arcToRelative(2.85f, 2.85f, 0.0f, false, true, 2.83f, -2.85f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 22.0f)
                horizontalLineTo(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineTo(10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 8.0f)
                horizontalLineTo(6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 22.0f)
                close()
                moveTo(4.0f, 10.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 7.0f)
                arcTo(3.0f, 3.0f, 0.0f, true, true, 8.0f, 4.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 5.0f, 7.0f)
                close()
                moveTo(5.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 6.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.0f, 3.0f)
                close()
            }
        }
        .build()
        return _linkedin!!
    }

private var _linkedin: ImageVector? = null
