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

public val SharpGroup.VideoSettings: ImageVector
    get() {
        if (_videoSettings != null) {
            return _videoSettings!!
        }
        _videoSettings = Builder(name = "VideoSettings", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 6.0f)
                lineToRelative(18.0f, 0.0f)
                lineToRelative(0.0f, 5.0f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.0f, -7.0f)
                lineToRelative(-22.0f, 0.0f)
                lineToRelative(0.0f, 16.0f)
                lineToRelative(11.0f, 0.0f)
                lineToRelative(0.0f, -2.0f)
                lineToRelative(-9.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 12.0f)
                lineToRelative(-6.0f, -4.0f)
                lineToRelative(0.0f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.72f, 17.57f)
                lineToRelative(1.23f, -0.98f)
                lineToRelative(-1.25f, -2.17f)
                lineTo(21.23f, 15.0f)
                curveToRelative(-0.23f, -0.17f, -0.48f, -0.31f, -0.75f, -0.42f)
                lineTo(20.25f, 13.0f)
                horizontalLineToRelative(-2.5f)
                lineToRelative(-0.24f, 1.58f)
                curveToRelative(-0.26f, 0.11f, -0.51f, 0.26f, -0.74f, 0.42f)
                lineToRelative(-1.48f, -0.58f)
                lineToRelative(-1.25f, 2.17f)
                lineToRelative(1.24f, 0.99f)
                curveToRelative(-0.03f, 0.29f, -0.04f, 0.58f, -0.01f, 0.86f)
                lineToRelative(-1.23f, 0.98f)
                lineToRelative(1.25f, 2.17f)
                lineTo(16.77f, 21.0f)
                curveToRelative(0.23f, 0.17f, 0.48f, 0.31f, 0.75f, 0.42f)
                lineTo(17.75f, 23.0f)
                horizontalLineToRelative(2.5f)
                lineToRelative(0.24f, -1.58f)
                curveToRelative(0.26f, -0.11f, 0.51f, -0.26f, 0.74f, -0.42f)
                lineToRelative(1.48f, 0.58f)
                lineToRelative(1.25f, -2.17f)
                lineToRelative(-1.24f, -0.99f)
                curveTo(22.75f, 18.14f, 22.75f, 17.85f, 22.72f, 17.57f)
                close()
                moveTo(19.0f, 19.5f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveTo(19.83f, 19.5f, 19.0f, 19.5f)
                close()
            }
        }
        .build()
        return _videoSettings!!
    }

private var _videoSettings: ImageVector? = null
