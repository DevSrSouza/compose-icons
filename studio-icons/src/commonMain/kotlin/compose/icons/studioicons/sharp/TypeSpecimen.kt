package compose.icons.studioicons.sharp

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
import compose.icons.studioicons.SharpGroup

public val SharpGroup.TypeSpecimen: ImageVector
    get() {
        if (_typeSpecimen != null) {
            return _typeSpecimen!!
        }
        _typeSpecimen = Builder(name = "TypeSpecimen", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                lineToRelative(-2.0f, 0.0f)
                lineToRelative(0.0f, 16.0f)
                lineToRelative(16.0f, 0.0f)
                lineToRelative(0.0f, -2.0f)
                lineToRelative(-14.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 2.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(16.0f)
                verticalLineTo(2.0f)
                close()
                moveTo(16.63f, 14.5f)
                lineToRelative(-0.8f, -2.3f)
                horizontalLineToRelative(-3.63f)
                lineToRelative(-0.82f, 2.3f)
                horizontalLineTo(9.81f)
                lineToRelative(3.38f, -9.0f)
                horizontalLineToRelative(1.61f)
                lineToRelative(3.38f, 9.0f)
                horizontalLineTo(16.63f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.96f, 7.17f)
                lineToRelative(-1.31f, 3.72f)
                lineToRelative(2.69f, 0.0f)
                lineToRelative(-1.3f, -3.72f)
                close()
            }
        }
        .build()
        return _typeSpecimen!!
    }

private var _typeSpecimen: ImageVector? = null
