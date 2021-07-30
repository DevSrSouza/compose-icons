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

public val OutlineGroup.ShieldOff: ImageVector
    get() {
        if (_shieldOff != null) {
            return _shieldOff!!
        }
        _shieldOff = Builder(name = "ShieldOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(4.71f, 3.29f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.29f, 4.71f)
                lineToRelative(16.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.42f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.42f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.3f, 19.68f)
                lineToRelative(-0.3f, 0.17f)
                lineToRelative(-0.3f, -0.17f)
                arcTo(13.15f, 13.15f, 0.0f, false, true, 5.0f, 8.23f)
                verticalLineTo(8.09f)
                lineTo(5.16f, 8.0f)
                lineTo(3.73f, 6.56f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 3.0f, 8.09f)
                verticalLineToRelative(0.14f)
                arcToRelative(15.17f, 15.17f, 0.0f, false, false, 7.72f, 13.2f)
                lineToRelative(0.3f, 0.17f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineToRelative(0.3f, -0.17f)
                arcToRelative(15.22f, 15.22f, 0.0f, false, false, 3.0f, -2.27f)
                lineToRelative(-1.42f, -1.42f)
                arcTo(12.56f, 12.56f, 0.0f, false, true, 12.3f, 19.68f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 6.34f)
                lineTo(13.0f, 2.4f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 0.0f)
                lineTo(7.32f, 4.49f)
                lineTo(8.78f, 6.0f)
                lineTo(12.0f, 4.15f)
                lineToRelative(7.0f, 3.94f)
                verticalLineToRelative(0.14f)
                arcToRelative(13.0f, 13.0f, 0.0f, false, true, -1.63f, 6.31f)
                lineTo(18.84f, 16.0f)
                arcTo(15.08f, 15.08f, 0.0f, false, false, 21.0f, 8.23f)
                verticalLineTo(8.09f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.0f, 6.34f)
                close()
            }
        }
        .build()
        return _shieldOff!!
    }

private var _shieldOff: ImageVector? = null
