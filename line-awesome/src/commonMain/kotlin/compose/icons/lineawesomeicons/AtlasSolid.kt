package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.AtlasSolid: ImageVector
    get() {
        if (_atlasSolid != null) {
            return _atlasSolid!!
        }
        _atlasSolid = Builder(name = "AtlasSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 4.0f)
                curveTo(7.355f, 4.0f, 6.0f, 5.355f, 6.0f, 7.0f)
                lineTo(6.0f, 25.0f)
                curveTo(6.0f, 26.645f, 7.355f, 28.0f, 9.0f, 28.0f)
                lineTo(26.0f, 28.0f)
                lineTo(26.0f, 4.0f)
                lineTo(9.0f, 4.0f)
                close()
                moveTo(9.0f, 6.0f)
                lineTo(24.0f, 6.0f)
                lineTo(24.0f, 22.0f)
                lineTo(9.0f, 22.0f)
                curveTo(8.648f, 22.0f, 8.316f, 22.073f, 8.0f, 22.188f)
                lineTo(8.0f, 7.0f)
                curveTo(8.0f, 6.434f, 8.434f, 6.0f, 9.0f, 6.0f)
                close()
                moveTo(16.0f, 8.0f)
                curveTo(12.699f, 8.0f, 10.0f, 10.699f, 10.0f, 14.0f)
                curveTo(10.0f, 17.301f, 12.699f, 20.0f, 16.0f, 20.0f)
                curveTo(19.301f, 20.0f, 22.0f, 17.301f, 22.0f, 14.0f)
                curveTo(22.0f, 10.699f, 19.301f, 8.0f, 16.0f, 8.0f)
                close()
                moveTo(16.688f, 10.094f)
                curveTo(17.171f, 10.176f, 17.625f, 10.323f, 18.031f, 10.563f)
                lineTo(18.096f, 11.281f)
                lineTo(17.627f, 11.094f)
                lineTo(17.252f, 11.406f)
                lineTo(17.314f, 12.313f)
                lineTo(18.283f, 12.031f)
                lineTo(19.471f, 12.406f)
                lineTo(19.158f, 12.938f)
                lineTo(18.438f, 12.5f)
                lineTo(17.656f, 12.625f)
                lineTo(16.906f, 13.188f)
                lineTo(16.469f, 14.5f)
                lineTo(17.313f, 15.188f)
                curveTo(17.313f, 15.188f, 18.205f, 15.031f, 18.252f, 15.031f)
                curveTo(18.299f, 15.031f, 18.627f, 15.846f, 18.627f, 15.846f)
                lineTo(18.127f, 17.377f)
                curveTo(17.513f, 17.759f, 16.785f, 18.0f, 16.0f, 18.0f)
                curveTo(15.766f, 18.0f, 15.535f, 17.945f, 15.313f, 17.906f)
                lineTo(15.123f, 17.594f)
                lineTo(15.594f, 15.844f)
                lineTo(13.813f, 14.5f)
                lineTo(12.156f, 14.5f)
                lineTo(12.031f, 14.25f)
                curveTo(12.026f, 14.164f, 12.0f, 14.086f, 12.0f, 14.0f)
                curveTo(12.0f, 13.785f, 12.031f, 13.578f, 12.063f, 13.375f)
                lineTo(12.906f, 12.719f)
                lineTo(14.688f, 11.875f)
                lineTo(14.406f, 10.719f)
                lineTo(15.188f, 10.563f)
                lineTo(15.531f, 11.063f)
                lineTo(16.877f, 10.813f)
                lineTo(16.688f, 10.094f)
                close()
                moveTo(13.063f, 16.719f)
                lineTo(13.377f, 16.719f)
                lineTo(13.971f, 17.438f)
                curveTo(13.63f, 17.237f, 13.328f, 17.004f, 13.063f, 16.719f)
                close()
                moveTo(9.0f, 24.0f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 26.0f)
                lineTo(9.0f, 26.0f)
                curveTo(8.434f, 26.0f, 8.0f, 25.566f, 8.0f, 25.0f)
                curveTo(8.0f, 24.434f, 8.434f, 24.0f, 9.0f, 24.0f)
                close()
            }
        }
        .build()
        return _atlasSolid!!
    }

private var _atlasSolid: ImageVector? = null
