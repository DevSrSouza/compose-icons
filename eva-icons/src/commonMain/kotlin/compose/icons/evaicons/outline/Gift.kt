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

public val OutlineGroup.Gift: ImageVector
    get() {
        if (_gift != null) {
            return _gift!!
        }
        _gift = Builder(name = "Gift", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(19.2f, 7.0f)
                horizontalLineToRelative(-0.39f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 19.0f, 6.0f)
                arcToRelative(3.08f, 3.08f, 0.0f, false, false, -3.14f, -3.0f)
                arcTo(4.46f, 4.46f, 0.0f, false, false, 12.0f, 5.4f)
                arcTo(4.46f, 4.46f, 0.0f, false, false, 8.14f, 3.0f)
                arcTo(3.08f, 3.08f, 0.0f, false, false, 5.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.19f, 1.0f)
                horizontalLineTo(4.8f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 3.0f, 9.2f)
                verticalLineToRelative(3.6f)
                arcTo(2.08f, 2.08f, 0.0f, false, false, 4.5f, 15.0f)
                verticalLineToRelative(4.37f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 6.31f, 21.0f)
                horizontalLineTo(17.69f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 1.81f, -1.67f)
                verticalLineTo(15.0f)
                arcTo(2.08f, 2.08f, 0.0f, false, false, 21.0f, 12.8f)
                verticalLineTo(9.2f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.2f, 7.0f)
                close()
                moveTo(19.0f, 9.2f)
                verticalLineToRelative(3.6f)
                arcToRelative(0.56f, 0.56f, 0.0f, false, true, 0.0f, 0.2f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(6.0f)
                arcTo(0.56f, 0.56f, 0.0f, false, true, 19.0f, 9.2f)
                close()
                moveTo(15.86f, 5.0f)
                arcTo(1.08f, 1.08f, 0.0f, false, true, 17.0f, 6.0f)
                arcToRelative(1.08f, 1.08f, 0.0f, false, true, -1.14f, 1.0f)
                horizontalLineTo(13.4f)
                arcTo(2.93f, 2.93f, 0.0f, false, true, 15.86f, 5.0f)
                close()
                moveTo(7.0f, 6.0f)
                arcTo(1.08f, 1.08f, 0.0f, false, true, 8.14f, 5.0f)
                arcToRelative(2.93f, 2.93f, 0.0f, false, true, 2.45f, 2.0f)
                horizontalLineTo(8.14f)
                arcTo(1.08f, 1.08f, 0.0f, false, true, 7.0f, 6.0f)
                close()
                moveTo(5.0f, 9.2f)
                arcTo(0.56f, 0.56f, 0.0f, false, true, 5.0f, 9.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(5.0f)
                arcToRelative(0.56f, 0.56f, 0.0f, false, true, 0.0f, -0.2f)
                close()
                moveTo(6.5f, 15.0f)
                horizontalLineTo(11.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(6.5f)
                close()
                moveTo(13.0f, 19.0f)
                verticalLineTo(15.0f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _gift!!
    }

private var _gift: ImageVector? = null
