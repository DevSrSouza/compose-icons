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

public val FillGroup.Gift: ImageVector
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
                moveTo(4.64f, 15.27f)
                verticalLineToRelative(4.82f)
                arcToRelative(0.92f, 0.92f, 0.0f, false, false, 0.92f, 0.91f)
                horizontalLineToRelative(5.62f)
                verticalLineTo(15.27f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.82f, 21.0f)
                horizontalLineToRelative(5.62f)
                arcToRelative(0.92f, 0.92f, 0.0f, false, false, 0.92f, -0.91f)
                verticalLineTo(15.27f)
                horizontalLineTo(12.82f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.1f, 7.09f)
                lineTo(18.26f, 7.09f)
                arcToRelative(2.82f, 2.82f, 0.0f, false, false, 0.29f, -1.23f)
                arcTo(2.87f, 2.87f, 0.0f, false, false, 15.68f, 3.0f)
                arcTo(4.21f, 4.21f, 0.0f, false, false, 12.0f, 5.57f)
                arcTo(4.21f, 4.21f, 0.0f, false, false, 8.32f, 3.0f)
                arcTo(2.87f, 2.87f, 0.0f, false, false, 5.45f, 5.86f)
                arcToRelative(2.82f, 2.82f, 0.0f, false, false, 0.29f, 1.23f)
                lineTo(3.9f, 7.09f)
                curveToRelative(-0.5f, 0.0f, -0.9f, 0.59f, -0.9f, 1.31f)
                verticalLineToRelative(3.93f)
                curveToRelative(0.0f, 0.72f, 0.4f, 1.31f, 0.9f, 1.31f)
                horizontalLineToRelative(7.28f)
                lineTo(11.18f, 7.09f)
                horizontalLineToRelative(1.64f)
                verticalLineToRelative(6.55f)
                lineTo(20.1f, 13.64f)
                curveToRelative(0.5f, 0.0f, 0.9f, -0.59f, 0.9f, -1.31f)
                lineTo(21.0f, 8.4f)
                curveTo(21.0f, 7.68f, 20.6f, 7.09f, 20.1f, 7.09f)
                close()
                moveTo(8.32f, 7.09f)
                arcToRelative(1.23f, 1.23f, 0.0f, true, true, 0.0f, -2.45f)
                curveToRelative(1.4f, 0.0f, 2.19f, 1.44f, 2.58f, 2.45f)
                close()
                moveTo(15.68f, 7.09f)
                lineTo(13.1f, 7.09f)
                curveToRelative(0.39f, -1.0f, 1.18f, -2.45f, 2.58f, -2.45f)
                arcToRelative(1.23f, 1.23f, 0.0f, true, true, 0.0f, 2.45f)
                close()
            }
        }
        .build()
        return _gift!!
    }

private var _gift: ImageVector? = null
