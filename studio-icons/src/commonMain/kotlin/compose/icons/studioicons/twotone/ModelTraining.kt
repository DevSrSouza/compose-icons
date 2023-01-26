package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.ModelTraining: ImageVector
    get() {
        if (_modelTraining != null) {
            return _modelTraining!!
        }
        _modelTraining = Builder(name = "ModelTraining", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 13.5f)
                curveToRelative(0.0f, 2.0f, -2.5f, 3.5f, -2.5f, 5.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.5f, -2.5f, -3.0f, -2.5f, -5.0f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(0.0f)
                curveTo(13.93f, 10.0f, 15.5f, 11.57f, 15.5f, 13.5f)
                close()
                moveTo(13.0f, 19.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(21.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(19.5f)
                close()
                moveTo(19.0f, 13.0f)
                curveToRelative(0.0f, 1.68f, -0.59f, 3.21f, -1.58f, 4.42f)
                lineToRelative(1.42f, 1.42f)
                curveTo(20.18f, 17.27f, 21.0f, 15.23f, 21.0f, 13.0f)
                curveToRelative(0.0f, -2.74f, -1.23f, -5.19f, -3.16f, -6.84f)
                lineToRelative(-1.42f, 1.42f)
                curveTo(17.99f, 8.86f, 19.0f, 10.82f, 19.0f, 13.0f)
                close()
                moveTo(16.0f, 5.0f)
                lineToRelative(-4.0f, -4.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f)
                curveToRelative(0.0f, 2.23f, 0.82f, 4.27f, 2.16f, 5.84f)
                lineToRelative(1.42f, -1.42f)
                curveTo(5.59f, 16.21f, 5.0f, 14.68f, 5.0f, 13.0f)
                curveToRelative(0.0f, -3.86f, 3.14f, -7.0f, 7.0f, -7.0f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f)
                verticalLineToRelative(3.0f)
                lineTo(16.0f, 5.0f)
                close()
            }
        }
        .build()
        return _modelTraining!!
    }

private var _modelTraining: ImageVector? = null
