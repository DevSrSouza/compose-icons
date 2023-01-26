package compose.icons.studioicons.round

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
import compose.icons.studioicons.RoundGroup

public val RoundGroup.TypeSpecimen: ImageVector
    get() {
        if (_typeSpecimen != null) {
            return _typeSpecimen!!
        }
        _typeSpecimen = Builder(name = "TypeSpecimen", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 6.0f)
                lineTo(3.0f, 6.0f)
                curveTo(2.45f, 6.0f, 2.0f, 6.45f, 2.0f, 7.0f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(7.0f)
                curveTo(4.0f, 6.45f, 3.55f, 6.0f, 3.0f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 2.0f)
                horizontalLineTo(8.0f)
                curveTo(6.9f, 2.0f, 6.0f, 2.9f, 6.0f, 4.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(4.0f)
                curveTo(22.0f, 2.9f, 21.1f, 2.0f, 20.0f, 2.0f)
                close()
                moveTo(16.46f, 14.01f)
                lineToRelative(-0.63f, -1.82f)
                horizontalLineToRelative(-3.63f)
                lineToRelative(-0.65f, 1.82f)
                curveToRelative(-0.1f, 0.29f, -0.38f, 0.48f, -0.68f, 0.48f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.51f, 0.0f, -0.86f, -0.51f, -0.68f, -0.98f)
                lineToRelative(2.73f, -7.27f)
                curveTo(13.08f, 5.8f, 13.52f, 5.5f, 14.0f, 5.5f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.48f, 0.0f, 0.92f, 0.3f, 1.09f, 0.75f)
                lineToRelative(2.73f, 7.27f)
                curveToRelative(0.18f, 0.47f, -0.17f, 0.98f, -0.68f, 0.98f)
                horizontalLineToRelative(0.0f)
                curveTo(16.83f, 14.5f, 16.56f, 14.31f, 16.46f, 14.01f)
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
