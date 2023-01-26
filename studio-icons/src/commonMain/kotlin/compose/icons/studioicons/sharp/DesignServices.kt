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

public val SharpGroup.DesignServices: ImageVector
    get() {
        if (_designServices != null) {
            return _designServices!!
        }
        _designServices = Builder(name = "DesignServices", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.79f, 17.06f)
                lineToRelative(-5.55f, -5.55f)
                lineToRelative(1.57f, -1.57f)
                lineToRelative(-3.75f, -3.75f)
                lineToRelative(-1.57f, 1.57f)
                lineTo(6.94f, 2.21f)
                lineTo(2.21f, 6.94f)
                lineToRelative(5.55f, 5.55f)
                lineTo(3.0f, 17.25f)
                verticalLineTo(21.0f)
                horizontalLineToRelative(3.75f)
                lineToRelative(4.76f, -4.76f)
                lineToRelative(5.55f, 5.55f)
                lineToRelative(0.0f, 0.0f)
                verticalLineToRelative(0.0f)
                lineTo(21.79f, 17.06f)
                close()
                moveTo(9.18f, 11.07f)
                lineTo(5.04f, 6.94f)
                lineToRelative(1.9f, -1.9f)
                lineToRelative(1.27f, 1.27f)
                lineTo(7.02f, 7.5f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.19f, -1.19f)
                lineToRelative(1.45f, 1.45f)
                lineTo(9.18f, 11.07f)
                close()
                moveTo(12.93f, 14.82f)
                lineToRelative(1.9f, -1.9f)
                lineToRelative(1.45f, 1.45f)
                lineToRelative(-1.19f, 1.19f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.19f, -1.19f)
                lineToRelative(1.27f, 1.27f)
                lineToRelative(-1.9f, 1.9f)
                lineTo(12.93f, 14.82f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.1329f, 5.123f)
                lineToRelative(2.5385f, -2.5385f)
                lineToRelative(3.7476f, 3.7476f)
                lineToRelative(-2.5385f, 2.5385f)
                close()
            }
        }
        .build()
        return _designServices!!
    }

private var _designServices: ImageVector? = null
