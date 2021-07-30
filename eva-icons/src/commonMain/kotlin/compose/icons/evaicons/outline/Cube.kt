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

public val OutlineGroup.Cube: ImageVector
    get() {
        if (_cube != null) {
            return _cube!!
        }
        _cube = Builder(name = "Cube", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(20.66f, 7.26f)
                arcToRelative(0.0f, 0.0f, 0.0f, false, true, 0.0f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.0f, -0.07f, -0.1f, -0.14f, -0.15f, -0.21f)
                lineToRelative(-0.09f, -0.1f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -0.86f, -0.68f)
                lineToRelative(-6.4f, -3.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(2.7f, 2.7f, 0.0f, false, false, -2.26f, 0.0f)
                lineToRelative(-6.4f, 3.0f)
                arcToRelative(2.6f, 2.6f, 0.0f, false, false, -0.86f, 0.68f)
                lineTo(3.52f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.15f, 0.2f)
                lineToRelative(0.0f, 0.0f)
                arcToRelative(0.0f, 0.0f, 0.0f, false, true, 0.0f, 0.0f)
                arcTo(2.39f, 2.39f, 0.0f, false, false, 3.0f, 8.46f)
                verticalLineToRelative(7.06f)
                arcToRelative(2.49f, 2.49f, 0.0f, false, false, 1.46f, 2.26f)
                lineToRelative(6.4f, 3.0f)
                arcToRelative(2.7f, 2.7f, 0.0f, false, false, 2.27f, 0.0f)
                lineToRelative(6.4f, -3.0f)
                arcTo(2.49f, 2.49f, 0.0f, false, false, 21.0f, 15.54f)
                lineTo(21.0f, 8.46f)
                arcTo(2.39f, 2.39f, 0.0f, false, false, 20.66f, 7.26f)
                close()
                moveTo(11.71f, 5.06f)
                arcToRelative(0.73f, 0.73f, 0.0f, false, true, 0.58f, 0.0f)
                lineToRelative(5.33f, 2.48f)
                lineTo(12.0f, 10.15f)
                lineTo(6.38f, 7.54f)
                close()
                moveTo(5.3f, 16.0f)
                arcToRelative(0.47f, 0.47f, 0.0f, false, true, -0.3f, -0.43f)
                lineTo(5.0f, 9.1f)
                lineToRelative(6.0f, 2.79f)
                verticalLineToRelative(6.72f)
                close()
                moveTo(18.69f, 16.0f)
                lineTo(13.0f, 18.61f)
                lineTo(13.0f, 11.89f)
                lineTo(19.0f, 9.1f)
                verticalLineToRelative(6.44f)
                arcTo(0.48f, 0.48f, 0.0f, false, true, 18.69f, 16.0f)
                close()
            }
        }
        .build()
        return _cube!!
    }

private var _cube: ImageVector? = null
