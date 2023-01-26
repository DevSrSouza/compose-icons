package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.Android: ImageVector
    get() {
        if (_android != null) {
            return _android!!
        }
        _android = Builder(name = "Android", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.6f, 9.48f)
                lineToRelative(1.84f, -3.18f)
                curveToRelative(0.16f, -0.31f, 0.04f, -0.69f, -0.26f, -0.85f)
                curveToRelative(-0.29f, -0.15f, -0.65f, -0.06f, -0.83f, 0.22f)
                lineToRelative(-1.88f, 3.24f)
                curveToRelative(-2.86f, -1.21f, -6.08f, -1.21f, -8.94f, 0.0f)
                lineTo(5.65f, 5.67f)
                curveToRelative(-0.19f, -0.29f, -0.58f, -0.38f, -0.87f, -0.2f)
                curveTo(4.5f, 5.65f, 4.41f, 6.01f, 4.56f, 6.3f)
                lineTo(6.4f, 9.48f)
                curveTo(3.3f, 11.25f, 1.28f, 14.44f, 1.0f, 18.0f)
                horizontalLineToRelative(22.0f)
                curveTo(22.72f, 14.44f, 20.7f, 11.25f, 17.6f, 9.48f)
                close()
                moveTo(7.0f, 15.25f)
                curveToRelative(-0.69f, 0.0f, -1.25f, -0.56f, -1.25f, -1.25f)
                curveToRelative(0.0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
                reflectiveCurveTo(8.25f, 13.31f, 8.25f, 14.0f)
                curveTo(8.25f, 14.69f, 7.69f, 15.25f, 7.0f, 15.25f)
                close()
                moveTo(17.0f, 15.25f)
                curveToRelative(-0.69f, 0.0f, -1.25f, -0.56f, -1.25f, -1.25f)
                curveToRelative(0.0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
                reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f)
                curveTo(18.25f, 14.69f, 17.69f, 15.25f, 17.0f, 15.25f)
                close()
            }
        }
        .build()
        return _android!!
    }

private var _android: ImageVector? = null
