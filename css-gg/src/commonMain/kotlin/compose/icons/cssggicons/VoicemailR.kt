package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.VoicemailR: ImageVector
    get() {
        if (_voicemailR != null) {
            return _voicemailR!!
        }
        _voicemailR = Builder(name = "VoicemailR", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.5f, 12.0f)
                curveTo(11.5f, 12.351f, 11.44f, 12.687f, 11.329f, 13.0f)
                horizontalLineTo(13.671f)
                curveTo(13.56f, 12.687f, 13.5f, 12.351f, 13.5f, 12.0f)
                curveTo(13.5f, 10.343f, 14.843f, 9.0f, 16.5f, 9.0f)
                curveTo(18.157f, 9.0f, 19.5f, 10.343f, 19.5f, 12.0f)
                curveTo(19.5f, 13.657f, 18.157f, 15.0f, 16.5f, 15.0f)
                horizontalLineTo(8.5f)
                curveTo(6.843f, 15.0f, 5.5f, 13.657f, 5.5f, 12.0f)
                curveTo(5.5f, 10.343f, 6.843f, 9.0f, 8.5f, 9.0f)
                curveTo(10.157f, 9.0f, 11.5f, 10.343f, 11.5f, 12.0f)
                close()
                moveTo(9.5f, 12.0f)
                curveTo(9.5f, 12.552f, 9.052f, 13.0f, 8.5f, 13.0f)
                curveTo(7.948f, 13.0f, 7.5f, 12.552f, 7.5f, 12.0f)
                curveTo(7.5f, 11.448f, 7.948f, 11.0f, 8.5f, 11.0f)
                curveTo(9.052f, 11.0f, 9.5f, 11.448f, 9.5f, 12.0f)
                close()
                moveTo(17.5f, 12.0f)
                curveTo(17.5f, 12.552f, 17.052f, 13.0f, 16.5f, 13.0f)
                curveTo(15.948f, 13.0f, 15.5f, 12.552f, 15.5f, 12.0f)
                curveTo(15.5f, 11.448f, 15.948f, 11.0f, 16.5f, 11.0f)
                curveTo(17.052f, 11.0f, 17.5f, 11.448f, 17.5f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.5f, 8.0f)
                curveTo(1.5f, 6.343f, 2.843f, 5.0f, 4.5f, 5.0f)
                horizontalLineTo(19.5f)
                curveTo(21.157f, 5.0f, 22.5f, 6.343f, 22.5f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(22.5f, 17.657f, 21.157f, 19.0f, 19.5f, 19.0f)
                horizontalLineTo(4.5f)
                curveTo(2.843f, 19.0f, 1.5f, 17.657f, 1.5f, 16.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(4.5f, 7.0f)
                horizontalLineTo(19.5f)
                curveTo(20.052f, 7.0f, 20.5f, 7.448f, 20.5f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(20.5f, 16.552f, 20.052f, 17.0f, 19.5f, 17.0f)
                horizontalLineTo(4.5f)
                curveTo(3.948f, 17.0f, 3.5f, 16.552f, 3.5f, 16.0f)
                verticalLineTo(8.0f)
                curveTo(3.5f, 7.448f, 3.948f, 7.0f, 4.5f, 7.0f)
                close()
            }
        }
        .build()
        return _voicemailR!!
    }

private var _voicemailR: ImageVector? = null
