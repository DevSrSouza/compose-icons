package compose.icons.phosphoricons.duotone

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
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.TennisBall: ImageVector
    get() {
        if (_tennisBall != null) {
            return _tennisBall!!
        }
        _tennisBall = Builder(name = "TennisBall", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(60.1f, 60.1f)
                arcTo(95.5f, 95.5f, 0.0f, false, true, 127.8f, 32.0f)
                horizontalLineToRelative(0.0f)
                arcTo(95.9f, 95.9f, 0.0f, false, true, 32.0f, 127.8f)
                arcTo(95.5f, 95.5f, 0.0f, false, true, 60.1f, 60.1f)
                close()
                moveTo(32.0f, 128.0f)
                verticalLineToRelative(-0.2f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(128.2f, 224.2f)
                lineTo(128.2f, 224.0f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(156.3f, 156.3f)
                arcTo(95.5f, 95.5f, 0.0f, false, false, 128.2f, 224.0f)
                arcTo(95.9f, 95.9f, 0.0f, false, false, 224.0f, 128.2f)
                horizontalLineToRelative(0.0f)
                arcTo(95.5f, 95.5f, 0.0f, false, false, 156.3f, 156.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(231.9f, 129.1f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, false, 0.1f, -0.9f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, false, -0.1f, -1.0f)
                arcTo(104.0f, 104.0f, 0.0f, false, false, 128.0f, 24.0f)
                horizontalLineToRelative(-0.2f)
                arcTo(104.0f, 104.0f, 0.0f, false, false, 24.1f, 126.9f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, false, -0.1f, 0.9f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, false, 0.1f, 1.0f)
                arcTo(104.0f, 104.0f, 0.0f, false, false, 128.0f, 232.0f)
                horizontalLineToRelative(0.2f)
                arcTo(104.0f, 104.0f, 0.0f, false, false, 231.9f, 129.1f)
                close()
                moveTo(65.8f, 65.8f)
                arcToRelative(87.4f, 87.4f, 0.0f, false, true, 53.6f, -25.3f)
                arcToRelative(87.8f, 87.8f, 0.0f, false, true, -78.9f, 78.9f)
                arcTo(87.1f, 87.1f, 0.0f, false, true, 65.8f, 65.8f)
                close()
                moveTo(40.4f, 135.5f)
                arcToRelative(104.0f, 104.0f, 0.0f, false, false, 95.1f, -95.1f)
                arcToRelative(87.8f, 87.8f, 0.0f, false, true, 80.1f, 80.1f)
                arcToRelative(104.0f, 104.0f, 0.0f, false, false, -95.1f, 95.1f)
                arcToRelative(87.8f, 87.8f, 0.0f, false, true, -80.1f, -80.1f)
                close()
                moveTo(136.6f, 215.5f)
                arcToRelative(87.8f, 87.8f, 0.0f, false, true, 78.9f, -78.9f)
                arcToRelative(87.8f, 87.8f, 0.0f, false, true, -78.9f, 78.9f)
                close()
            }
        }
        .build()
        return _tennisBall!!
    }

private var _tennisBall: ImageVector? = null
