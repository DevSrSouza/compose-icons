package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.FactCheck: ImageVector
    get() {
        if (_factCheck != null) {
            return _factCheck!!
        }
        _factCheck = Builder(name = "FactCheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.0f, 3.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(20.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(2.0f)
                close()
                moveTo(10.0f, 17.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineTo(17.0f)
                close()
                moveTo(10.0f, 13.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineTo(13.0f)
                close()
                moveTo(10.0f, 9.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(5.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(14.82f, 15.0f)
                lineTo(12.0f, 12.16f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(1.41f, 1.42f)
                lineTo(17.99f, 9.0f)
                lineToRelative(1.42f, 1.42f)
                lineTo(14.82f, 15.0f)
                close()
            }
        }
        .build()
        return _factCheck!!
    }

private var _factCheck: ImageVector? = null
