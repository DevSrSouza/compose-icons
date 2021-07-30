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

public val OutlineGroup.CornerDownRight: ImageVector
    get() {
        if (_cornerDownRight != null) {
            return _cornerDownRight!!
        }
        _cornerDownRight = Builder(name = "CornerDownRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 24.0f)
                lineToRelative(0.0f, -24.0f)
                lineToRelative(24.0f, -0.0f)
                lineToRelative(0.0f, 24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.78f, 12.38f)
                lineToRelative(-4.0f, -5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.56f, 1.24f)
                lineTo(16.92f, 12.0f)
                horizontalLineTo(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineTo(6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.0f, 6.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineToRelative(8.92f)
                lineToRelative(-2.7f, 3.38f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.16f, 1.4f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.78f, -0.38f)
                lineToRelative(4.0f, -5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.78f, 12.38f)
                close()
            }
        }
        .build()
        return _cornerDownRight!!
    }

private var _cornerDownRight: ImageVector? = null
