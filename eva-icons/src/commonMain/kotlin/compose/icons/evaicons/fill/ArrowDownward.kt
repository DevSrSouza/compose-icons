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

public val FillGroup.ArrowDownward: ImageVector
    get() {
        if (_arrowDownward != null) {
            return _arrowDownward!!
        }
        _arrowDownward = Builder(name = "ArrowDownward", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(18.77f, 13.36f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.41f, -0.13f)
                lineTo(13.0f, 16.86f)
                verticalLineTo(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineTo(16.86f)
                lineTo(6.64f, 13.23f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.28f, 1.54f)
                lineToRelative(6.0f, 5.0f)
                lineToRelative(0.15f, 0.09f)
                lineToRelative(0.13f, 0.07f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.72f, 0.0f)
                lineToRelative(0.13f, -0.07f)
                lineToRelative(0.15f, -0.09f)
                lineToRelative(6.0f, -5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.77f, 13.36f)
                close()
            }
        }
        .build()
        return _arrowDownward!!
    }

private var _arrowDownward: ImageVector? = null
