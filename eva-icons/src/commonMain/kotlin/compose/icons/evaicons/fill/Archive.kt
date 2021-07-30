package compose.icons.evaicons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.evaicons.FillGroup

public val FillGroup.Archive: ImageVector
    get() {
        if (_archive != null) {
            return _archive!!
        }
        _archive = Builder(name = "Archive", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 3.0f)
                horizontalLineTo(6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 4.0f, 8.22f)
                verticalLineTo(18.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineTo(17.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                verticalLineTo(8.22f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 18.0f, 3.0f)
                close()
                moveTo(15.0f, 13.13f)
                arcToRelative(0.87f, 0.87f, 0.0f, false, true, -0.87f, 0.87f)
                horizontalLineTo(9.87f)
                arcTo(0.87f, 0.87f, 0.0f, false, true, 9.0f, 13.13f)
                verticalLineToRelative(-0.26f)
                arcTo(0.87f, 0.87f, 0.0f, false, true, 9.87f, 12.0f)
                horizontalLineToRelative(4.26f)
                arcToRelative(0.87f, 0.87f, 0.0f, false, true, 0.87f, 0.87f)
                close()
                moveTo(18.0f, 7.0f)
                horizontalLineTo(6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 5.0f)
                horizontalLineTo(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                close()
            }
        }
        .build()
        return _archive!!
    }

private var _archive: ImageVector? = null
