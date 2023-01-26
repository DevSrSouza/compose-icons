package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.Grading: ImageVector
    get() {
        if (_grading != null) {
            return _grading!!
        }
        _grading = Builder(name = "Grading", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 7.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(4.0f, 13.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(13.0f)
                close()
                moveTo(4.0f, 17.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(17.0f)
                close()
                moveTo(4.0f, 21.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(21.0f)
                close()
                moveTo(15.41f, 18.17f)
                lineTo(14.0f, 16.75f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(15.41f, 21.0f)
                lineTo(20.0f, 16.42f)
                lineTo(18.58f, 15.0f)
                lineTo(15.41f, 18.17f)
                close()
                moveTo(4.0f, 3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(16.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _grading!!
    }

private var _grading: ImageVector? = null
