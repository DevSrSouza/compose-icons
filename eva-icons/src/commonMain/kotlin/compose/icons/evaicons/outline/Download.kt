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

public val OutlineGroup.Download: ImageVector
    get() {
        if (_download != null) {
            return _download!!
        }
        _download = Builder(name = "Download", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(5.0f, 18.0f)
                lineTo(19.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.0f, 19.0f)
                lineTo(20.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.0f, 20.0f)
                lineTo(5.0f, 20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.0f, 19.0f)
                lineTo(4.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 18.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 19.0f)
                lineTo(4.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 16.0f)
                lineTo(5.0f, 16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 17.0f)
                lineTo(6.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 20.0f)
                lineTo(5.0f, 20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.0f, 19.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 19.0f)
                lineTo(18.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.0f, 16.0f)
                lineTo(19.0f, 16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.0f, 17.0f)
                lineTo(20.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.0f, 20.0f)
                lineTo(19.0f, 20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 19.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.58f, -0.18f)
                lineTo(7.42f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.24f, -1.39f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.4f, -0.24f)
                lineTo(12.0f, 12.76f)
                lineTo(15.4f, 10.2f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.2f, 1.6f)
                lineToRelative(-4.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 15.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineTo(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 13.0f)
                close()
            }
        }
        .build()
        return _download!!
    }

private var _download: ImageVector? = null
